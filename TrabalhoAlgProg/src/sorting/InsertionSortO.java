package sorting;

import util.LinkedList;
import util.Node;

public class InsertionSortO {
	
	
	/**
	 * Método que ordena a lista pelo InsertionSort Optimizado.
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0}; //Contador de swaps e comparações.
		for(Node nodeI = list.getHead(); nodeI != null; nodeI = nodeI.getNext()) {
			Node nodeJ = nodeI;
			swapComp[1]++;
			Node aux = new Node();
			aux = nodeJ;
			while(nodeJ.getPrev() != null && nodeJ.getPrev().getValue() > aux.getValue()) {
				nodeJ = nodeJ.getPrev();
			}
			if(aux != nodeJ) {
				if(aux.getPrev() != null)
					aux.getPrev().setNext(aux.getNext());;
				aux.setPrev(nodeJ.getPrev());
				aux.setNext(nodeJ);
				if(aux.getPrev() == null)
					list.setHead(aux);
				swapComp[0]++;
			}
		}
		list.setHead(list.getHead()); // fix tail
		return swapComp;
	}

}
