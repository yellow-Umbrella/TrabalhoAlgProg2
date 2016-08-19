package linkedSort;

import util.LinkedList;

public class SelectionSort {
	
	public void sort (LinkedList list) {
		
		for (int i = 0; i < list.size(); i++) {
			int min = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.getValue(j) < list.getValue(min))
					min = j;
			}
		
			if (min != i)
				list.swap(i, min);
			
		}
	}
}
