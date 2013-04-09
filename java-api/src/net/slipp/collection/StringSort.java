package net.slipp.collection;

public class StringSort {
	public static String[] sort(String[] values) {
		int offset, minimumIndex;
		for (offset = 0; offset < values.length -1; offset++) {
			minimumIndex = getMinimumIndex(values, offset);
			swap(values, offset, minimumIndex);
		}
		return values;
	}

	static int getMinimumIndex(String[] values, int offset) {
		int index = offset;
		String minimumValue = values[offset];
		for(int i=offset+1; i < values.length; i++) {
			if (values[i].charAt(0) < minimumValue.charAt(0)) {
				index = i;
				minimumValue = values[i];
			}
		}
		return index;
	}
	
	static void swap(String[] values, int source, int target) {
		String temp = values[source];
		values[source] = values[target];
		values[target] = temp;
	}
}
