package tests;

import sorting.BubbleSortO;
import util.LinkedList;

public class BubbleSortOTest {
	public static void main(String[] args) {
		
		int[] vet = {64, 25, 12, 22, 11};
		LinkedList list = new LinkedList(vet);
		
		System.out.println(list);
		
		new BubbleSortO().sort(list);
		
		System.out.println(list);
		
		
	}

}
