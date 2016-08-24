package tests;

import sorting.SelectionSort;
import util.LinkedList;

public class SelectionSortTest {
	public static void main(String[] args) {
		
		int[] vet = {64, 25, 12, 22, 11};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		SelectionSort.sort(list);
		
		System.out.println(list);
		
	}

}
