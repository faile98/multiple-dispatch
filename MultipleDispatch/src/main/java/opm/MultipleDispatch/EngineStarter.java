package opm.MultipleDispatch;

import opm.MultipleDispatch.model.Car;
import opm.MultipleDispatch.model.ElectricCar;
import opm.MultipleDispatch.model.Truck;
import opm.MultipleDispatch.model.Vehicle;

public class EngineStarter {

	public String crank(Vehicle vehicle, String inString) {
		// Unknown... it's a concept here
		System.out.println("Expecting [" + inString + "] Actual [" + vehicle.CRANK_SOUND + "]: " + vehicle.getClass().getSimpleName());
		return Vehicle.CRANK_SOUND;
	}

	public String crank(Car car, String inString) {
		// Turn the key
		System.out.println("Expecting [" + inString + "] Actual [" + car.CRANK_SOUND +"]: " + car.getClass().getSimpleName());
		return Car.CRANK_SOUND;
	}

	public String crank(Truck truck, String inString) {
		// Prime the engine and do other stuff
		System.out.println("Expecting [" + inString + "] Actual [" + truck.CRANK_SOUND +"]: " + truck.getClass().getSimpleName());
		return Truck.CRANK_SOUND;
	}

	public String crank(ElectricCar electricCar, String inString) {
		// Push a button
		System.out.println("Expecting [" + inString + "] Actual [" + electricCar.CRANK_SOUND + "]: " + electricCar.getClass().getSimpleName());
		return ElectricCar.CRANK_SOUND;
	}
	
}
