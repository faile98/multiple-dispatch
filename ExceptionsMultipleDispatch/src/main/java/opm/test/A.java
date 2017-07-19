package opm.test;

public abstract class A extends RuntimeException {

	public A() {
		super("A");
	}
	
	public A(String msg) {
		super(msg);
	}
}
