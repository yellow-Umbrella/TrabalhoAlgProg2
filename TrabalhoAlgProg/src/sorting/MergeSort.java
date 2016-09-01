package sorting;

import util.LinkedList;
import util.Node;

public class MergeSort {
	long[] swapComp = {0, 0}; //Contador de swaps e comparações.
	
	/**
	 * Método que ordena a lista pelo MergeSort.
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		list.setHead(sort(list.getHead()));
		return swapComp;
	}
	
	/**
	 * Método recursivo MergeSort.
	 * @param head
	 * @return
	 */
	private Node sort(Node head) {
		if(head.getNext() != null) {
			Node middle = getMiddle(head);
			Node middleNext = middle.getNext();
			middle.setNext(null);
			middleNext.setPrev(null);
			
			head = sort(head);
			middleNext = sort(middleNext);
			
			head = merge(head, middleNext);
			swapComp[0]++;
		}
		return head;
	}
	
	/**
	 * Método que faz o merge na volta da recursão.
	 * @param head
	 * @param middle
	 * @return
	 */
	private Node merge(Node head, Node middle) {
		LinkedList list = new LinkedList();
		while(head != null || middle != null) {
			if(head == null) {
				list.add(middle.getValue());
				middle = middle.getNext();
			}
			else if(middle == null) {
				list.add(head.getValue());
				head = head.getNext();
			}
			else if(head.getValue() > middle.getValue()) {
				swapComp[1]++;
				list.add(middle.getValue());
				middle = middle.getNext();
			}
			else {
				swapComp[1]++;
				list.add(head.getValue());
				head = head.getNext();
			}
		}
		return list.getHead();
	}
	
	/**
	 * Método que acha o nó no meio da lista.
	 * @param head
	 * @return
	 */
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