package sorting;

import java.util.Iterator;

import util.LinkedList;
import util.Node;

public class BubbleSort {

	public long sort(LinkedList list) {
		long swap = 0;
		
		for(int i = 0; i < list.size(); i++) {
			Node value1 = null, value2 = null;
			for(Iterator<Node> j = list.iterator(); j.hasNext();) {
				if(value1 == null)
					value1 = j.next();
				else
					value1 = value2;
				value2 = j.next();
				if(value1.compareTo(value2) > 0) {
					list.swap(value1, value2);
					swap++;
				}
			}
		}
		return swap;
	}

}
