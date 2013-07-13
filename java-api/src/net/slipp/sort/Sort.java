package net.slipp.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	static void sortAsc(ArrayList<Person> persons) {
		for (int i = 0; i < persons.size() - 1; i++) {
			int minimunIndex = findMinimunIndex(persons, i);
			Collections.swap(persons, i, minimunIndex);
		}
	}
	
	private static int findMinimunIndex(ArrayList<Person> values, int currentIndex) {
		int minimunIndex = currentIndex;
		for (int j = currentIndex+1; j < values.size(); j++) {
			if (values.get(j).isYounger(values.get(minimunIndex)) ) {
				minimunIndex = j;
			}
		}
		return minimunIndex;
	}
	
	private static int findMaximumIndexIndex(ArrayList<Person> values, int currentIndex) {
		int maximumIndex = currentIndex;
		for (int j = currentIndex+1; j < values.size(); j++) {
			if (!values.get(j).isYounger(values.get(maximumIndex)) ) {
				maximumIndex = j;
			}
		}
		return maximumIndex;
	}
	
	static void sortDesc(ArrayList<Person> persons) {
		for (int i = 0; i < persons.size() - 1; i++) {
			int maximumIndex = findMaximumIndexIndex(persons, i);
			Collections.swap(persons, i, maximumIndex);
		}		
	}
}
