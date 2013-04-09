package net.slipp.sort;

public class AgeSort {
	public Age[] sort(Age[] values) {
		int offset, minimumIndex;
		for (offset = 0; offset < values.length - 1; offset++) {
			minimumIndex = getMinimumIndex(values, offset);
			swap(values, offset, minimumIndex);
		}
		return values;
	}

	int getMinimumIndex(Age[] values, int offset) {
		int index = offset;
		Age minimumValue = values[offset];
		for (int i = offset + 1; i < values.length; i++) {
			if (values[i].getAge() < minimumValue.getAge()) {
				index = i;
				minimumValue = values[i];
			}
		}
		return index;		
	}

	void swap(Age[] values, int source, int target) {
		Age temp = values[source];
		values[source] = values[target];
		values[target] = temp;		
	}
}
