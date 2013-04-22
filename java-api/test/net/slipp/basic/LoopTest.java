package net.slipp.basic;

import junit.framework.TestCase;

public class LoopTest extends TestCase {
	public void testCommas() throws Exception {
		String sequence = "1,2,3,4,5";
		assertEquals(sequence, sequenceUsingDo(1, 5));
		assertEquals(sequence, sequenceUsingFor(1, 5));
		assertEquals(sequence, sequenceUsingWhile(1, 5));
		
		sequence = "8";
		assertEquals(sequence, sequenceUsingDo(8, 8));
		assertEquals(sequence, sequenceUsingFor(8, 8));
		assertEquals(sequence, sequenceUsingWhile(8, 8));
	}

	private String sequenceUsingFor(int start, int end) {
		return null;
	}

	private String sequenceUsingDo(int start, int end) {
		return null;
	}
	
	private String sequenceUsingWhile(int start, int end) {
		return null;
	}
}
