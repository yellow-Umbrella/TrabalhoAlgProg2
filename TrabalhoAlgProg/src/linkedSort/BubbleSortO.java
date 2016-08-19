package linkedSort;

import util.LinkedList;

public class BubbleSortO {
	
	public void sort (LinkedList list) {
		boolean o = true;
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.getValue(j) > list.getValue(j+1)) {
					list.swap(j, j + 1);
					o = false;
				}
			}
			if (o) // Verifica se a lista esta ordenada
				break;
		}
	}
	
}
