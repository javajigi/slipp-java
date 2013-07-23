package net.slipp.inheritance;

import java.util.ArrayList;
import java.util.HashSet;

import junit.framework.TestCase;

public class CollectionTest extends TestCase {
	public void testArrayList() throws Exception {
		Student student1 = new Student("유림", 20);
		
		ArrayList students = new ArrayList();
		students.add(student1);
		assertTrue(students.contains(student1));
		
		assertTrue(students.contains(new Student("유림", 20)));
	}
	
	public void testHashSet() throws Exception {
		Student student1 = new Student("유림", 20);
		Student student2 = new Student("유림", 20);
		Student student3 = new Student("진우", 22);
		
		HashSet students = new HashSet();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		assertEquals(2, students.size());
	}
}
