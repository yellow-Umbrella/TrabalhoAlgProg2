package sorting;

import java.util.Iterator;

import util.LinkedList;
import util.Node;

//To-Do optimization

public class BubbleSortO {
	
	public void sort(LinkedList list) {
		boolean sorted = true; // variável de otimização
		
		for(int i = 0; i < list.size(); i++) {
			Node value1 = null, value2 = null;
			for(Iterator<Node> j = list.iterator(); j.hasNext();) {
				if(value1 == null)
					value1 = j.next();
				else
					value1 = value2;
				value2 = j.next();
				if(value1.compareTo(value2) > 0) {
					list.swap(value1, value2);
					sorted = false;
				}
			}
			if(sorted) // verifica se já esta ordenado
				break;
		}
	}

}
