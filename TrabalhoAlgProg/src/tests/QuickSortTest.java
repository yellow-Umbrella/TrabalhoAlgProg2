package tests;

import sorting.QuickSort;
import util.LinkedList;

public class QuickSortTest {
	
	public static void main(String[] args) {
		
		QuickSort quick = new QuickSort();
		int[] vet = {29,87,0,7,1,15,28,79};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		quick.sort(list);
		
		System.out.println(list);
		
	}

}
