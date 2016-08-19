package linkedSort;

import util.LinkedList;

public class BubbleSort {
	
	public void sort(LinkedList list) {
		
		for(int i = 0; i < list.size()-1; i++) {	//for(Iterator<Integer> it = list.iterator(); it.hasNext();)
			for(int j = 0; j < list.size()-1; j++) {
				if(list.getValue(j) > list.getValue(j+1))
					list.swap(j, j+1);
			}
		}
	}

}
