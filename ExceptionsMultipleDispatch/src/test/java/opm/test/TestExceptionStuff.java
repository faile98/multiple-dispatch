package opm.test;

import org.junit.Test;

public class TestExceptionStuff {

	ExceptionHandler handler = new ExceptionHandler();
	
	@Test(expected=B1.class)
	public void catchSpecific() {
		throwB1();
	}
	
	@Test(expected=B2.class)
	public void catchB2(){
		throwB2();
	}
	
	@Test(expected=A.class)
	public void catchCByA() {
		throwC();
	}
	
	@Test
	public void catchCast() {
		try {
			throwC();
		} catch (A ex) {
			handler.handle(ex);
		}
	}

	private void throwB1() {
		throw new B1();
	}

	private void throwB2() {
		throw new B2();
	}

	private void throwC() {
		throw new C();
	}
}
