package net.slipp.reflection;

import org.junit.Test;

public class Junit4Test {
	@Test
	public void one() throws Exception {
		System.out.println("Running Test1");
	}
	
	@Test
	public void two() throws Exception {
		System.out.println("Running Test2");
	}
	
	public void testThree() throws Exception {
		System.out.println("Running Test3");
	}
}
