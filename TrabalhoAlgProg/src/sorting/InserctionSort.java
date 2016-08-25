package sorting;

import util.LinkedList;
import util.Node;

public class InserctionSort {

	public int sort(LinkedList list) {
		int swap = 0;
		
		for(Node nodeI = list.get(0); nodeI != null; nodeI = nodeI.getNext()) {
			Node nodeJ = nodeI;
			while(nodeJ.getPrev() != null && nodeJ.getPrev().getValue() > nodeJ.getValue()) {
				list.swap(nodeJ, nodeJ.getPrev());
				swap++;
				nodeJ = nodeJ.getPrev();
			}
		}
		return swap;
	}
	
}
