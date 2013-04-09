package net.slipp.collection;

import junit.framework.TestCase;

public class IntegerSortTest extends TestCase {
	public void testSort() throws Exception {
		Integer[] values = {1, 5, 3, 2};
		Integer[] sortedValues = IntegerSort.sort(values);
		
		assertEquals(new Integer(1), sortedValues[0]);
		assertEquals(new Integer(2), sortedValues[1]);
		assertEquals(new Integer(3), sortedValues[2]);
		assertEquals(new Integer(5), sortedValues[3]);
	}
	
	public void testSwap() throws Exception {
		Integer[] values = {1, 5, 3, 2};
		int source = 1;
		int target = 2;
		IntegerSort.swap(values, source, target);
		assertEquals(new Integer(3), values[source]);
		assertEquals(new Integer(5), values[target]);		
	}
	
	public void testMinimumIndex() throws Exception {
		Integer[] values = {1, 5, 3, 2};
		int offset = 1;
		int result = IntegerSort.getMinimumIndex(values, offset);
		assertEquals(3, result);
	}
}
