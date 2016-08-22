package linkedSort;

import java.util.Iterator;

import util.LinkedList;

public class BubbleSort {
	
	public void sort(LinkedList list) {
		
		for(int i = 0; i < list.size()-1; i++) {
			for(Iterator<Integer> j = list.iterator(); j.hasNext();) {
				int value1 = j.next(), value2 = j.next();
				if(value1 > value2)
					list.swap(value1, value2);
			}
		}
	}

}
