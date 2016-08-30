package toDo;

import util.LinkedList;
import util.Node;

public class QuickSort {
	
	long swapComp[] = {0, 0};

	public long sort(LinkedList list) {
		quickSort(list, list.getHead(), list.getTail());
		return 0;
	}
	
	private void quickSort(LinkedList list, Node left, Node right) {
		
		if(left != right) {
		
			Node pivot = left;
			
			while(right != left) {
			
				if(pivot == left) {
					if(!(pivot.compareTo(right) < 0)) {
						list.swap(pivot, right);
						pivot = right;
					}
					else {
						right = right.getPrev();
					}
				}
				
				else if(pivot == right) {
					if(!(pivot.compareTo(left) > 0)) {
						list.swap(pivot, left);
						pivot = left;
					}
					else {
						left = left.getNext();
					}
				}
				
			}
			
			if(pivot.getPrev() != null)
				quickSort(list, list.getHead(), pivot.getPrev());
			
			
			quickSort(list, pivot.getNext(), list.getTail());
		
		}
	}

}
