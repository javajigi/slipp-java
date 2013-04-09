package net.slipp.collection;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;

public class CollectionsTest extends TestCase {
	public void testSort() throws Exception {
		ArrayList<String> values = new ArrayList<String>();
		values.add("KOR");
		values.add("ENGL");
		values.add("CHN");
		
		Collections.sort(values);
		
		assertEquals("CHN", values.get(0));
		assertEquals("ENGL", values.get(1));
		assertEquals("KOR", values.get(2));
	}
	
	public void testSort2() throws Exception {
		ArrayList<String> values = new ArrayList<String>();
		values.add("KOR");
		values.add("ENGL");
		values.add("CHN");
		
		ArrayList<String> sortedValues = new ArrayList<String>(values);
		Collections.sort(sortedValues);
		
		assertEquals("CHN", sortedValues.get(0));
		assertEquals("ENGL", sortedValues.get(1));
		assertEquals("KOR", sortedValues.get(2));
		
		assertEquals("KOR", values.get(0));
		assertEquals("ENGL", values.get(1));
		assertEquals("CHN", values.get(2));		
	}
}
