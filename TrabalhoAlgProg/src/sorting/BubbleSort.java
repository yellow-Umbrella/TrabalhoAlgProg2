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
		
		for(int i = 0; i < list.size(); i++) {
			Node value1 = null, value2 = null;
			for(Iterator<Node> j = list.iterator(); j.hasNext();) {
				if(value1 == null)
					value1 = j.next();
				else
					value1 = value2;
				value2 = j.next();
				if(value1.compareTo(value2) > 0)
					list.swap(value1, value2);
			}
		}
		
	}

}
