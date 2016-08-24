package tests;

import sorting.InserctionSort;
import util.LinkedList;

public class InserctionSortTest {
	
	public static void main(String[] args) {
		
		int[] vet = {64, 25, 12, 22, 11};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		new InserctionSort().sort(list);
		
		System.out.println(list);
		
	}

}
