package tests;

import sorting.MergeSort;
import util.LinkedList;

public class MergeSortTest {
	
	public static void main(String[] args) {
		
		int[] vet = {10, 9, 22248, 734, 36, 5, 4, 3, 2, 1, 0};
		LinkedList list = new LinkedList(vet);
		MergeSort merge = new MergeSort();
		System.out.println(list.size() + " " + list.getHead() + " " + list.getTail() + "\n" + list);
		
		merge.sort(list);
		
		System.out.println(list.size() + " " + list.getHead() + " " + list.getTail() + "\n" + list);
		
	}

}
