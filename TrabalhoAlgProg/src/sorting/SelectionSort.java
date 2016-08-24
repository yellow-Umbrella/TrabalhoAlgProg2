package sorting;

import util.LinkedList;
import util.Node;

public class SelectionSort {

	public void sort(LinkedList list) {
		Node min;
		for(Node nodeWall = list.get(0); nodeWall != null; nodeWall = nodeWall.getNext()) {
			min = nodeWall;
			for(Node node = nodeWall; node != null; node = node.getNext()) {
				if(node.compareTo(min) < 1)
					min = node;
				
			}
			
			if(min != nodeWall)
				list.swap(min, nodeWall);
		}
		
	}
	
	
	

}
