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
	
	public void testScoreSortAsc() throws Exception {
		ArrayList<Score> scores = createValues(new Score(88.0), new Score(85.2), new Score(92.3));
		Sort.sortAsc(scores);
		assertEqualsValues(scores, new Score(85.2), new Score(88.0), new Score(92.3));
	}
	
	public void testScoreSortDesc() throws Exception {
		ArrayList<Score> scores = createValues(new Score(88.0), new Score(85.2), new Score(92.3));
		Sort.sortDesc(scores);
		assertEqualsValues(scores, new Score(92.3), new Score(88.0), new Score(85.2));
	}
	
    private <T> void assertEqualsValues(ArrayList<T> sortedValues, T... values) {
        for (int i = 0; i < sortedValues.size(); i++) {
            assertEquals(values[i], sortedValues.get(i));
        }
    }

    private <T> ArrayList<T> createValues(T... values) {
        ArrayList<T> unsortedValues = new ArrayList<T>();
        for (T value : values) {
            unsortedValues.add(value);
        }
        return unsortedValues;
    }
}
