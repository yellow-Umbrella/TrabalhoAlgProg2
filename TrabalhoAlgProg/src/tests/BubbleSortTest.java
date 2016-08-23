package tests;

import sorting.BubbleSortDead;
import util.LinkedList;

public class BubbleSortTest {
	
	public static void main(String[] args) {
		
		int vet[] = {4, 3, 5, 2, 8, 1};
		LinkedList list = new LinkedList(vet);
		BubbleSortDead bubble = new BubbleSortDead();
		
		System.out.println(list);
		
		bubble.sort(list);
		
		System.out.println(list);
		
	
	
	}

}
