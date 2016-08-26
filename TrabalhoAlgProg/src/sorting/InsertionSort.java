package sorting;

import util.LinkedList;
import util.Node;

public class InsertionSort {

	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0};
		
		for(Node nodeI = list.get(0); nodeI != null; nodeI = nodeI.getNext()) {
			Node nodeJ = nodeI;
			swapComp[1]++;
			while(nodeJ.getPrev() != null && nodeJ.getPrev().getValue() > nodeJ.getValue()) {
				swapComp[1]++;
				list.swap(nodeJ, nodeJ.getPrev());
				swapComp[0]++;
				nodeJ = nodeJ.getPrev();
			}
		}
		return swapComp;
	}
	
}
