package toDo;

import util.LinkedList;
import util.Node;

public class MergeSort {
	long[] swapComp = {0, 0};
	
	public long[] sort(LinkedList list) {
		sort(list, list.getHead());
		list.fixHeadTaill();
		return swapComp;
	}
	
	private void sort(LinkedList list, Node head) {
		if(head.getNext() != null) {
			Node middle = getMiddle(head);
			Node middleNext = middle.getNext();
			middle.setNext(null);
			middleNext.setPrev(null);
			
			sort(list, head);
			sort(list, middleNext);
			
			merge(head, middleNext);
		}
		
	}
	
	private void merge(Node head, Node middle) {
		if(head.getValue() > middle.getValue()) {
			middle.setNext(head);
			head.setPrev(middle);
		}
		else {
			head.setNext(middle);
			middle.setPrev(head);
		}
	}
	
	private Node getMiddle(Node head) {
		Node no1 = head;
		Node no2 = head;
		while(no1.getNext() != null && no2.getNext() != null && no2.getNext().getNext() != null) {
			no1 = no1.getNext();
			no2 = no2.getNext().getNext();
		}
		return no1;
	}
	
}
