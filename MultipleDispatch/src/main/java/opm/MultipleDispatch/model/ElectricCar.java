package opm.MultipleDispatch.model;

import opm.MultipleDispatch.EngineStarter;

public class ElectricCar extends Car {
	
	public static final String CRANK_SOUND = "Quiet as can be";

	@Override
	public void visit(EngineStarter engineStarter, String inString) {
		super.visit(engineStarter, inString);
	}
}
