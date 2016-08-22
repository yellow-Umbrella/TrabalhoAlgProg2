package sorting;

import java.util.Iterator;

import util.LinkedList;
import util.Node;

public class BubbleSortDead extends TheDadofSortings {

	@Override
	public void sort(int[] vet) {
		for(int i = 0; i < vet.length-1; i++)
			for(int j = 0; j < vet.length-1; j++)
				if(vet[j] > vet[j+1])
					swap(vet, j, j+1);
	}
	
	//not working
	Node n1, n2;
	public void sort(LinkedList list) {
		for(Iterator i1 = list.iterator(); i1.hasNext();) {
			for(Iterator i2 = list.iterator(); i2.hasNext();) {
				if((n1 = (Node)i2.next()).getValue() > (n2 = (Node)i2.next()).getValue() ) {
					list.swap(n1, n2);
				}
				
			}
			
		}
		
	}

}
