package net.slipp.inheritance2;

import junit.framework.TestCase;

public class InheritanceTest extends TestCase {
	public void testConstructor() throws Exception {
		Child1 child = new Child1();
		assertTrue(child.isCalled());
	}
}
