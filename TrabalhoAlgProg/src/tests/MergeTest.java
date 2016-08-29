package tests;

import sorting.MergeSort;
import util.LinkedList;

public class MergeTest {
	public static void main(String[] args) {
		MergeSort merge = new MergeSort();
		int[] vet = {7, 676, 22, 11, 72, 31, 0, 1, 2, 3, 5, 4};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		System.out.println(list.size() + " " + list.getHead().getValue() + " " + list.getTail().getValue());
		
		merge.sort(list);
		
		System.out.println(list);
		System.out.println(list.size() + " " + list.getHead().getValue() + " " + list.getTail().getValue());		
		
	}

}
