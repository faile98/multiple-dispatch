package opm.MultipleDispatch;

import opm.MultipleDispatch.model.Vehicle;

public class GenericEngineStarter {

	public <T extends Vehicle> String crank(T unknown, String inString) {
		System.out.println("Expecting [" + inString + "] Actual [" + unknown.CRANK_SOUND + "]: " + unknown.getClass().getSimpleName());
		return unknown.CRANK_SOUND;
	}
}
