package net.slipp.extend;

import junit.framework.TestCase;

public class CoffeeTest extends TestCase {
	public void testPrepareRecipe() throws Exception {
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
	}
}
