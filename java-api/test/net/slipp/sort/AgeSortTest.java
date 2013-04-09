package net.slipp.sort;

import net.slipp.sort.AgeSort;
import junit.framework.TestCase;

public class AgeSortTest extends TestCase {
	private AgeSort sort;
	private Age[] values = new Age[3];
	
	@Override
	protected void setUp() throws Exception {
		values[0] = new Age(32);
		values[1] = new Age(35);
		values[2] = new Age(29);
		sort = new AgeSort();
	}
	
	public void testSort() throws Exception {
		Age[] sortedValues = sort.sort(values);
		
		assertEquals(new Age(29), sortedValues[0]);
		assertEquals(new Age(32), sortedValues[1]);
		assertEquals(new Age(35), sortedValues[2]);
	}
	
	public void testSwap() throws Exception {
		int source = 1;
		int target = 2;
		sort.swap(values, source, target);
		assertEquals(new Age(29), values[source]);
		assertEquals(new Age(35), values[target]);		
	}
	
	public void testMinimumIndex() throws Exception {
		int offset = 0;
		int result = sort.getMinimumIndex(values, offset);
		assertEquals(2, result);
	}
}
