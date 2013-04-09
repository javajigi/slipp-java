package net.slipp.collection;

import junit.framework.TestCase;

public class StringSortTest extends TestCase {
	public void testSort() throws Exception {
		String[] values = {"ENG", "CHN", "KOR"};
		String[] sortedValues = StringSort.sort(values);
		
		assertEquals("CHN", sortedValues[0]);
		assertEquals("ENG", sortedValues[1]);
		assertEquals("KOR", sortedValues[2]);
	}
	
	public void testSwap() throws Exception {
		String[] values = {"ENG", "CHN", "KOR"};
		int source = 0;
		int target = 1;
		StringSort.swap(values, source, target);
		assertEquals("CHN", values[source]);
		assertEquals("ENG", values[target]);		
	}
	
	public void testMinimumIndex() throws Exception {
		String[] values = {"ENG", "CHN", "KOR"};
		int offset = 0;
		int result = StringSort.getMinimumIndex(values, offset);
		assertEquals(1, result);
	}
}