package tests;

import sorting.CocktailSort;

public class CocktailSortTest {
	public static void main(String[] args) {
		
		int[] vet = {64, 73, 8, 100, 2, 9, 34};
		new CocktailSort().doSort(vet);
		
		for(int x: vet)
			System.out.printf("%d ", x);
		
	}

}
