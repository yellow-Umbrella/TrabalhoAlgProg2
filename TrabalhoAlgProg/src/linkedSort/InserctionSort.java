package linkedSort;

import util.LinkedList;

public class InserctionSort {
	
	public void sort (LinkedList list) {
		int j;
		
		for (int i = 0; i < list.size(); i++) {
			j = i;
			while (j > 0 && list.getValue(j-1) > list.getValue(j)) {
				list.swap(j, j - 1);
				j--;
			}
		}
		
	}
	
}
