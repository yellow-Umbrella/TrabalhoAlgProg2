package linkedSort;

import util.LinkedList;

public class MergeSort {

	public void sort (LinkedList list,int start, int end) {
		if (start < end) {
			int middle = (start + end)/2;
			sort(list, start, middle);
			sort(list, (middle + 1), end);
			
			merge (list, start, middle, end);
		}
	}
	
	private void merge(LinkedList list, int start, int middle, int end) {
		LinkedList newList = new LinkedList();
		
		for (int i = start; i < end; i++)
			newList.add(list.getValue(i), i);
		
		int i = start;
		int j = middle + 1;
		int k = start;
		
		while (i <= middle && j < end) {
			if (newList.getValue(i) <= newList.getValue(j))
				list.add(newList.getValue(i++), k++);
			else
				list.add(newList.getValue(j++), k++);
		}
		
		while (i <= middle)
			list.add(newList.getValue(i++), k++);
		
	}
	
}
