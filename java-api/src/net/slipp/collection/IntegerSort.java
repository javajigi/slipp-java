package net.slipp.collection;

public class IntegerSort {
	public static Integer[] sort(Integer[] values) {
		int offset, minimumIndex;
		for (offset = 0; offset < values.length -1; offset++) {
			minimumIndex = getMinimumIndex(values, offset);
			swap(values, offset, minimumIndex);
		}
		return values;
	}

	static int getMinimumIndex(Integer[] values, int offset) {
		int index = offset;
		Integer minimumValue = values[offset];
		for(int i=offset+1; i < values.length; i++) {
			if ( values[i] < minimumValue ) {
				index = i;
				minimumValue = values[i];
			}
		}
		return index;
	}

	static void swap(Integer[] values, int source, int target) {
		Integer temp = values[source];
		values[source] = values[target];
		values[target] = temp;
	}
}
