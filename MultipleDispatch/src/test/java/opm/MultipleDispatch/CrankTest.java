package opm.MultipleDispatch;

import org.junit.Test;

import opm.MultipleDispatch.model.Car;
import opm.MultipleDispatch.model.ElectricCar;
import opm.MultipleDispatch.model.Truck;
import opm.MultipleDispatch.model.Vehicle;

public class CrankTest {

	Car car = new Car();
	Truck truck = new Truck();
	ElectricCar electricCar = new ElectricCar();
	
	EngineStarter engineStarter = new EngineStarter();
	GenericEngineStarter genericEngineStarter = new GenericEngineStarter();
	
	@Test
	public void testCar() {
		engineStarter.crank(car, Car.CRANK_SOUND);
	}
	@Test
	public void testTruck() {
		engineStarter.crank(truck, Truck.CRANK_SOUND);
	}
	@Test
	public void testElectricCar() {
		engineStarter.crank(electricCar, ElectricCar.CRANK_SOUND);
	}
	
	@Test
	public void testCrankingStraight() {
		engineStarter.crank(car, Car.CRANK_SOUND);
		engineStarter.crank(truck, Truck.CRANK_SOUND);
		engineStarter.crank(electricCar, ElectricCar.CRANK_SOUND);
	}
	
	@Test
	public void testCrankingThroughCast() {
		crankLocal(car);
		crankLocal(truck);
		crankLocal(electricCar);
	}
	
	@Test
	public void testCrankingThroughVisitor() {
		car.visit(engineStarter, Car.CRANK_SOUND);
		truck.visit(engineStarter, Truck.CRANK_SOUND);
		electricCar.visit(engineStarter, ElectricCar.CRANK_SOUND);
	}
	
	private void crankLocal(Vehicle vehicle) {
		engineStarter.crank(vehicle, vehicle.CRANK_SOUND);
	}
	
	@Test
	public void testGenericCranking() {
		genericEngineStarter.crank(car, Car.CRANK_SOUND);
		genericEngineStarter.crank(truck, Truck.CRANK_SOUND);
		genericEngineStarter.crank(electricCar, ElectricCar.CRANK_SOUND);
	}
	
	@Test
	public void testCast() {
		Vehicle localCar = new Car();
		engineStarter.crank(localCar, Car.CRANK_SOUND);

	}
}
