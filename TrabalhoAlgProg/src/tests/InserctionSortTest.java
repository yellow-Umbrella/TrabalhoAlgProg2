package tests;

import sorting.InsertionSort;
import util.LinkedList;

public class InserctionSortTest {
	
	public static void main(String[] args) {
		
		int[] vet = {64, 25, 12, 22, 11};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		new InsertionSort().sort(list);
		
		System.out.println(list);
		
	}

}
