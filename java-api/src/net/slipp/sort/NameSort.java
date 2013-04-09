package net.slipp.sort;

public class NameSort {
	public Name[] sort(Name[] values) {
		int offset, minimumIndex;
		for (offset = 0; offset < values.length - 1; offset++) {
			minimumIndex = getMinimumIndex(values, offset);
			swap(values, offset, minimumIndex);
		}
		return values;
	}

	int getMinimumIndex(Name[] values, int offset) {
		int index = offset;
		Name minimumValue = values[offset];
		for (int i = offset + 1; i < values.length; i++) {
			if (values[i].getName().charAt(0) < minimumValue.getName().charAt(0)) {
				index = i;
				minimumValue = values[i];
			}
		}
		return index;
	}

	void swap(Name[] values, int source, int target) {
		Name temp = values[source];
		values[source] = values[target];
		values[target] = temp;
	}
}
