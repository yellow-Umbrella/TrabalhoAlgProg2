package linkedSort;

import util.LinkedList;

public class QuickSort {
	
	public void sort (LinkedList list, int init, int end) {
		
		if (init < end) {
			int pivot = partition(list, init, end);
			sort(list, init, (pivot - 1));
			sort(list, pivot, end);
		}
		
	}

	private int partition(LinkedList list, int init, int end) {
		int i = init;
		int j = end;
		
		int pivot = list.getValue(init + (end - init));
		
		while (i <= j) {
			while (list.getValue(i) < pivot)
				i++;
			while (list.getValue(j) > pivot)
				j--;
		}
		return i;
	}

	private int getPivot(LinkedList list, int init, int end) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
