package toDo;

import util.LinkedList;
import util.Node;

public class CocktailSort {
	
	public void sort(LinkedList list) {
		
		int i;
		Node node, aux;
		int n = list.size();
		boolean saida = true;
		
		while(saida) {
			saida = false;
			i = 0;
			node = list.get(0);
			
			while(i++ < (n-1)) {
				if(node.compareTo(node.getNext()) > 0) {
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
				if(aux.compareTo(aux.getPrev()) > 0) {
					saida = false;
					list.swap(aux, aux.getPrev());
				}
				
				aux = aux.getPrev();
			}
			
			
		}
		
	}
	
}
