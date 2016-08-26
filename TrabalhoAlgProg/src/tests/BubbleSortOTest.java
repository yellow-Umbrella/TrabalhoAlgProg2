package tests;

import sorting.BubbleSortO;
import util.LinkedList;

public class BubbleSortOTest {
	public static void main(String[] args) {
		
		int[] vet = {1, 2, 3, 5, 4};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		new BubbleSortO().sort(list);
		
		System.out.println(list);
		
		
	}

}
