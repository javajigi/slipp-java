package net.slipp.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	static <T extends MyComparable<? super T>> void sortAsc(ArrayList<T> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int targetIndex = findTargetIndex(list, i, true);
			Collections.swap(list, i, targetIndex);
		}
	}
	
	private static <T extends MyComparable<? super T>>  int findTargetIndex(ArrayList<T> values, int currentIndex, boolean isAsc) {
		int targetIndex = currentIndex;
		for (int j = currentIndex+1; j < values.size(); j++) {
			boolean result = values.get(j).compareTo(values.get(targetIndex));
			if (isAsc) {
				if (result) {
					targetIndex = j;
				}
			} else {
				if (!result) {
					targetIndex = j;
				}
			}
		}
		return targetIndex;
	}
	
	static <T extends MyComparable<? super T>>  void sortDesc(ArrayList<T> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int maximumIndex = findTargetIndex(list, i, false);
			Collections.swap(list, i, maximumIndex);
		}		
	}
}
