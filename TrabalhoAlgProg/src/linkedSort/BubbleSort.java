package linkedSort;

import java.util.Iterator;

import util.LinkedList;
import util.Node;

public class BubbleSort {
	
	public void sort(LinkedList list) {
		
		for(int i = 0; i < list.size()-1; i++) {
			for(Iterator<Node> j = list.iterator(); j.hasNext();) {
				Node value1 = j.next(), value2 = j.next();
				if(value1.getValue() > value2.getValue())
					list.swap(value1, value2);
			}
		}
	}

}
