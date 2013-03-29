package study;
import java.util.ArrayList;

import junit.framework.TestCase;

public class ArrayListTest extends TestCase {
	public void testCore() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		
		assertEquals("first", list.get(0));
		assertEquals(true, list.contains("first"));
		assertEquals("first", list.remove(0));
		assertEquals(false, list.contains("first"));
	}
	
	public void testArray() throws Exception {
		String[] list = new String[10];
		int index = 0;
		list[index] = "first";
		index = index + 1;
		list[index++] = "second";
		assertEquals("first", list[0]);
	}
}