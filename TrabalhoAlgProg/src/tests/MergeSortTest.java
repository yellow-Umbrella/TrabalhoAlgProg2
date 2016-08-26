package tests;

import toDo.MergeSort;
import util.LinkedList;

public class MergeSortTest {
	
	public static void main(String[] args) {
		
		int[] vet = {5, 1, 3, 7, 2};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		new MergeSort().sort(list);
		
		System.out.println(list);
		
	}

}
