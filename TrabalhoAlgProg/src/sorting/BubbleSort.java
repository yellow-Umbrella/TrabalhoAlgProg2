package sorting;

import java.util.Iterator;

import util.LinkedList;
import util.Node;

public class BubbleSort {
	
	/**
	 * Metodo que ordena a lista com BubbleSort.
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0};
		
		for(int i = 0; i < list.size(); i++) {
			Node value1 = null, value2 = null;
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
				}
			}
		}
		return swapComp;
	}

}
