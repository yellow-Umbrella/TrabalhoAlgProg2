package sorting;

import java.util.Iterator;
import util.LinkedList;
import util.Node;

public class BubbleSortO {
	
	/**
	 * Método que ordena a lista pelo BubbleSort Optimizado.
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0}; // Contador de comparações e swaps.
		boolean sorted; // variavel de otimizacao
		
		for(int i = 0; i < list.size(); i++) {
			Node value1 = null, value2 = null;
			sorted = true;
			for(Iterator<Node> j = list.iterator(); j.hasNext();) {
				
				if(value1 == null)
					value1 = j.next();
				else
					value1 = value2;
				
				value2 = j.next();
				swapComp[1]++;
				if(value1.compareTo(value2) > 0) {
					list.swap(value1, value2);
					swapComp[0]++;
					sorted = false;
				}
			}
			if(sorted) // verifica se ja esta ordenado
				break;
		}
		return swapComp;
	}

}
