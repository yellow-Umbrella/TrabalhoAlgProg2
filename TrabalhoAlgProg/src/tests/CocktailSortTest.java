package tests;

import sorting.CocktailSort;
import util.LinkedList;

public class CocktailSortTest {
	public static void main(String[] args) {
		
		int[] vet = {64, 73, 8, 100, 2, 9, 34};
		LinkedList list = new LinkedList(vet);
		
		CocktailSort cost = new CocktailSort();
		
		System.out.println(list);
		
		long ong[] = cost.sort(list);
		
		System.out.println(list);
		System.out.println(ong[0]);
		System.out.println(ong[1]);
		
	}

}
