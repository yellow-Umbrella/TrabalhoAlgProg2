package toDo;

import util.LinkedList;
import util.Node;

public class InsertionSortO {
	
	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0};
		//boolean sorted; // variavel de otimizacao
		
		for(Node nodeI = list.get(0); nodeI != null; nodeI = nodeI.getNext()) {
			Node nodeJ = nodeI;
			swapComp[1]++;
			//sorted = true;
			while(nodeJ.getPrev() != null && nodeJ.getPrev().getValue() > nodeJ.getValue()) {
				swapComp[1]++;
				list.swap(nodeJ, nodeJ.getPrev());
				swapComp[0]++;
				nodeJ = nodeJ.getPrev();
				//sorted = false;
			}
			//if(sorted) // verifica se ja esta ordenado
				//break;
		}
		return swapComp;
	}

}
