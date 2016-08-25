package sorting;

import util.LinkedList;
import util.Node;

public class SelectionSort {

	public long sort(LinkedList list) {
		long swap = 0;
		Node min;
		for(Node nodeWall = list.get(0); nodeWall != null; nodeWall = nodeWall.getNext()) {
			min = nodeWall;
			for(Node node = nodeWall; node != null; node = node.getNext()) {
				if(node.compareTo(min) < 1)
					min = node;
				
			}
			
			if(min != nodeWall) {
				list.swap(min, nodeWall);
				swap++;
			}
		}
		return swap;
	}
	
	
	

}
