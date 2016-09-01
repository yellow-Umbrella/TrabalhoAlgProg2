package sorting;

import util.LinkedList;
import util.Node;

public class SelectionSort {

	/**
	 * Método que ordena a lista pelo SelectionSort.
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0}; //contador de swaps e comparações.
		Node min;
		for(Node nodeWall = list.get(0); nodeWall != null; nodeWall = nodeWall.getNext()) {
			min = nodeWall;
			for(Node node = nodeWall; node != null; node = node.getNext()) {
				swapComp[1]++;
				if(node.compareTo(min) < 1)
					min = node;
				
			}
			
			if(min != nodeWall) {
				list.swap(min, nodeWall);
				swapComp[0]++;
			}
		}
		return swapComp;
	}
	
	
	

}
