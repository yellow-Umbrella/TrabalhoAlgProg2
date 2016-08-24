package sorting;

import util.LinkedList;
import util.Node;

public class InserctionSort {

	public void sort(LinkedList list) {
		
		for(Node nodeI = list.get(0); nodeI != null; nodeI = nodeI.getNext()) {
			Node nodeJ = nodeI;
			while(nodeJ.getPrev() != null && nodeJ.getPrev().getValue() > nodeJ.getValue()) {
				list.swap(nodeJ, nodeJ.getPrev());
				nodeJ = nodeJ.getPrev();
			}
		}
		
	}
	
}
