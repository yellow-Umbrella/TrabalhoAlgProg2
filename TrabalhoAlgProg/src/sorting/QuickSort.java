package sorting;

import util.LinkedList;
import util.Node;

public class QuickSort {
	
	long[] swapComp = {0, 0}; //Contador de swaps e comparações.

	/**
	 * Método que ordena a lista pelo QuickSort
	 * @param list
	 * @return
	 */
	public long[] sort(LinkedList list) {
		quickSort(list, list.getHead(), list.getTail());
		return swapComp;
	}
	
	/**
	 * Método recursivo QuickSort.
	 * @param list
	 * @param left
	 * @param right
	 */
	private void quickSort(LinkedList list, Node left, Node right) {
		
		
		if(left != right) {
			Node copyLeft = new Node(left);
			Node copyRight = new Node(right);
			Node pivot = left;
			
			while(right != left) {
				
				if(pivot == left) {
					swapComp[1]++;
					if(!(pivot.compareTo(right) < 0)) { //pivot > right swap
						swapComp[0]++;
						list.swap(pivot, right);
						pivot = right;
						left = left.getNext();
					}
					else {
						right = right.getPrev();
					}
				}
				
				else if(pivot == right) {
					swapComp[1]++;
					if(!(pivot.compareTo(left) > 0)) { // pivot > left !swap
						swapComp[0]++;
						list.swap(pivot, left);
						pivot = left;
						right = right.getPrev();
					}
					else {
						left = left.getNext();
					}
				}
				
			}
			
			copyLeft = copyLeft.getNext().getPrev();
			copyRight = copyRight.getPrev().getNext();
			
			if(pivot.getPrev() != null && copyLeft != null && pivot != copyLeft)
				quickSort(list, copyLeft, pivot.getPrev());
			if(pivot.getNext() != null && copyRight != null && pivot != copyRight)
				quickSort(list, pivot.getNext(), copyRight);
			
		
		}
	}

}
