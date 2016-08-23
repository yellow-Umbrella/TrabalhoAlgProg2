package sorting;

import java.util.Iterator;

import util.LinkedList;
import util.Node;

public class BubbleSort extends TheDadofSortings {

	@Override
	public void sort(int[] vet) {
		for (int i = 0; i < vet.length - 1; i++)
			for (int j = 0; j < vet.length - 1; j++)
				if (vet[j] > vet[j + 1])
					swap(vet, j, j + 1);
	}

	public void sort(LinkedList list) {
		
		for(Iterator<Node> i = list.iterator(); i.hasNext();) {
			Node value1 = i.next(), value2;
			for(Iterator<Node> j = list.iterator(); j.hasNext();) {
				value2 = j.next();
				if(value2.compareTo(value1) > 0)
					list.swap(value1, value2);
			}
		}
		
	}

}