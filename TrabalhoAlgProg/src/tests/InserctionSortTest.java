package tests;

import linkedSort.InserctionSort;
import util.LinkedList;

public class InserctionSortTest {
	
	public static void main(String[] args) {
		
		int vet[] = {4, 3, 5, 2, 8, 1};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		InserctionSort ins = new InserctionSort();
		ins.sort(list);
		System.out.println(list);
		
		
		
	}

}
