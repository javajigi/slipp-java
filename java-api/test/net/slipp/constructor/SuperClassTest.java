package net.slipp.constructor;

import junit.framework.TestCase;

public class SuperClassTest extends TestCase {
	public void testConstructorCalls() throws Exception {
		SuperClass superClass = new SubClass();
		assertTrue(SuperClass.constructorWasCalled);
	}
}

class SuperClass {
	static boolean constructorWasCalled = false;
	
	public SuperClass() {
		constructorWasCalled = true;
	}
}

class SubClass extends SuperClass {
	public SubClass() {
	}
}
