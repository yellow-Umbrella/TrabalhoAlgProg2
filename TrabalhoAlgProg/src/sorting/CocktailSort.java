package sorting;

import util.LinkedList;
import util.Node;

public class CocktailSort {
	
	long swapComp[] = {0, 0}; // Contador de comparações e swaps.
	
	/**
	 * Método que ordena a lista pelo CocktailSort.
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		
		int i;
		Node node, aux;
		int n = list.size();
		boolean saida = true;
		
		while(saida) {
			saida = false;
			i = 0;
			node = list.get(0);
			
			while(i++ < (n-1)) {
				swapComp[1]++;
				if(node.compareTo(node.getNext()) > 0) {
					swapComp[0]++;
					saida = true;
					list.swap(node, node.getNext());
				}
				
				node = node.getNext();
			}
			
			if(!saida)
				break;
			saida =false;
			i = (n-2);
			
			aux = list.getTail();
			while(i-- >= 0) {
				swapComp[1]++;
				if(aux.compareTo(aux.getPrev()) <= 0) {
					swapComp[0]++;
					saida = true;
					list.swap(aux, aux.getPrev());
				}
				
				aux = aux.getPrev();
			}
			
		}
		
		return swapComp;
		
	}
	
}
