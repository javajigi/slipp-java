package net.slipp.sort;

import net.slipp.sort.NameSort;
import junit.framework.TestCase;

public class NameSortTest extends TestCase {
	private NameSort sort;
	private Name[] values = new Name[3];
	
	@Override
	protected void setUp() throws Exception {
		values[0] = new Name("JaeSung");
		values[1] = new Name("YeEun");
		values[2] = new Name("CheolSu");
		sort = new NameSort();
	}
	
	public void testSort() throws Exception {
		Name[] sortedValues = sort.sort(values);
		
		assertEquals(new Name("CheolSu"), sortedValues[0]);
		assertEquals(new Name("JaeSung"), sortedValues[1]);
		assertEquals(new Name("YeEun"), sortedValues[2]);
	}
	
	public void testSwap() throws Exception {
		int source = 1;
		int target = 2;
		sort.swap(values, source, target);
		assertEquals(new Name("CheolSu"), values[source]);
		assertEquals(new Name("YeEun"), values[target]);		
	}
	
	public void testMinimumIndex() throws Exception {
		int offset = 0;
		int result = sort.getMinimumIndex(values, offset);
		assertEquals(2, result);
	}
}