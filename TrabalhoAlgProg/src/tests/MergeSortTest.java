package tests;

import sorting.BubbleSortO;
import util.LinkedList;

public class MergeSortTest {
	
	public static void main(String[] args) {
		
		int[] vet = {10, 9, 22248, 734, 36, 5, 4, 3, 2, 1, 0};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		new BubbleSortO().sort(list);
		
		System.out.println(list);
		
	}

}
