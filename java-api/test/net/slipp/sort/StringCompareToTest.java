package net.slipp.sort;

import junit.framework.TestCase;

public class StringCompareToTest extends TestCase {
	public void testCompareTo() throws Exception {
		assertTrue("A".compareTo("B") < 0);
		assertEquals(0, "A".compareTo("A"));
		assertTrue("B".compareTo("A") > 0);
	}
}
