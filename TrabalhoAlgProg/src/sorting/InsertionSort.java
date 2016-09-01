package sorting;

import util.LinkedList;
import util.Node;

public class InsertionSort {

	/**
	 * Método que ordena a lista pelo InsertionSort.
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0}; //Contador de swaps e comparações.
		
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
