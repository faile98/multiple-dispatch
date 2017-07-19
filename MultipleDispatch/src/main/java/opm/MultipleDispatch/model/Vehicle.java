package opm.MultipleDispatch.model;

import opm.MultipleDispatch.EngineStarter;

public abstract class Vehicle {

	public static final String CRANK_SOUND = "A generic vehicle cranking";
	
	public void visit(EngineStarter engineStarter, String inString) {
		engineStarter.crank(this, inString);
	}

}