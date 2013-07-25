package net.slipp.inheritance;

import junit.framework.TestCase;

public class InheritanceTest extends TestCase {
	public void testCoffee() throws Exception {
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
	}
	
	public void testTea() throws Exception {
		Tea tea = new Tea();
		tea.prepareRecipe();
	}
}
