package toDo;

import util.LinkedList;
import util.Node;

public class QuickSort {

	private Node partition(Node head, Node tail) {
		return head;
	}
	
	public long[] sort(LinkedList list) {
		long[] swapComp = {0, 0};
		
		return swapComp;
	}
	
	private void sort(Node head, Node tail) {
		Node pivot = partition(head, tail);
		Node pivotNext = pivot.getNext();
		
		if(head.getNext() != pivot)
			sort(head, pivot);
		if(pivotNext.getNext() != tail)
			sort(pivotNext, pivotNext);
	}

}
