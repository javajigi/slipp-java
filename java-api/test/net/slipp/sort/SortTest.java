package net.slipp.sort;

import java.util.ArrayList;

import junit.framework.TestCase;

public class SortTest extends TestCase {
	public void testSortAsc() throws Exception {
		ArrayList<Person> persons = createValues(new Person(30), new Person(23), new Person(25));
		Sort.sortAsc(persons);
		assertEqualsValues(persons, new Person(23), new Person(25), new Person(30));
	}
	
	public void testSortDesc() throws Exception {
		ArrayList<Person> persons = createValues(new Person(30), new Person(23), new Person(25));
		Sort.sortDesc(persons);
		assertEqualsValues(persons, new Person(30), new Person(25), new Person(23));
	}
	
    private void assertEqualsValues(ArrayList<Person> sortedValues, Person... values) {
        for (int i = 0; i < sortedValues.size(); i++) {
            assertEquals(values[i], sortedValues.get(i));
        }
    }

    private ArrayList<Person> createValues(Person... values) {
        ArrayList<Person> unsortedValues = new ArrayList<Person>();
        for (Person value : values) {
            unsortedValues.add(value);
        }
        return unsortedValues;
    }
}
