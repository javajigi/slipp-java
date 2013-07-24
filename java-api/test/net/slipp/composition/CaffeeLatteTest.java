package net.slipp.composition;

import junit.framework.TestCase;

public class CaffeeLatteTest extends TestCase {
	public void testPrepareRecipe() throws Exception {
		CaffeeLatte latte = new CaffeeLatte();
		latte.prepareRecipe();
	}
}
