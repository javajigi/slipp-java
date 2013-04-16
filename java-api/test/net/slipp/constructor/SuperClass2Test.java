package net.slipp.constructor;

import junit.framework.TestCase;

public class SuperClass2Test extends TestCase {
	public void testConstructorCalls() throws Exception {
		SuperClass2 superClass = new SubClass2("parm");
		assertTrue(SuperClass2.constructorWasCalled);
	}
}

class SuperClass2 {
	static boolean constructorWasCalled = false;
	
	public SuperClass2() {
		constructorWasCalled = true;
	}
}

class SubClass2 extends SuperClass2 {
	public SubClass2(String param) {
	}
}
