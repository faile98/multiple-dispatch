package opm.MultipleDispatch.model;

import opm.MultipleDispatch.EngineStarter;

public class Car extends Vehicle {
	
	public static final String CRANK_SOUND = "Normal car engine cranking sound";

	@Override
	public void visit(EngineStarter engineStarter, String inString) {
		engineStarter.crank(this, inString);
	}
}
