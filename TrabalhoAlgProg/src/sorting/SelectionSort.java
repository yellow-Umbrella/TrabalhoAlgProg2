package sorting;

import util.LinkedList;
import util.Node;

public abstract class SelectionSort {

	public void sort(int[] vet) { // remover
		
		for(int i = 0; i < vet.length-1; i++) {
			int min = i;
			for(int j = i+1; j < vet.length; j++)
				if(vet[j] < vet[min])
					min = j;
			//if(min != i)
				//swap(vet, i, min);
		}
		
	}
	
	public void sort(LinkedList list) {
		
		for(Node node = list.get(0); node != null; node = node.getNext()) {
			
		}
		
	}
	
	
	

}
