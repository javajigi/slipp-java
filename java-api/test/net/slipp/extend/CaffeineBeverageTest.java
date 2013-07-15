package net.slipp.extend;

import junit.framework.TestCase;

public class CaffeineBeverageTest extends TestCase {
	public void testPrepareRecipeToCoffee() throws Exception {
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();
	}
	
	public void testPrepareRecipeToTea() throws Exception {
		Tea tea = new Tea();
		tea.prepareRecipe();
	}
}
