package net.slipp.sort;

public class Sort<T extends SortComparable<? super T>> {
	public T[] sort(T[] values) {
		int offset, minimumIndex;
		for (offset = 0; offset < values.length - 1; offset++) {
			minimumIndex = getMinimumIndex(values, offset);
			swap(values, offset, minimumIndex);
		}
		return values;
	}

	int getMinimumIndex(T[] values, int offset) {
		int index = offset;
		T minimumValue = values[offset];
		for (int i = offset + 1; i < values.length; i++) {
			if ( values[i].compareTo(minimumValue) ) {
				index = i;
				minimumValue = values[i];
			}
		}
		return index;		
	}
	
	void swap(T[] values, int source, int target) {
		T temp = values[source];
		values[source] = values[target];
		values[target] = temp;		
	}
}
