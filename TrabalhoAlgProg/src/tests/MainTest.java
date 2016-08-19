package tests;

import linkedSort.BubbleSort;

import sorting.BubbleSortDead;
import sorting.InserctionSort;
import sorting.SelectionSort;

import util.LinkedList;

// Testando os algoritmos BubbleSort, InserctionSort, SelectionSort e BubbleLinked(BubbleSort com linkedList)

public class MainTest {
	public static void main(String[] args) {
		int vet1[] = {22, 67, 48, 2, 93, 24, 25, 22, 18, 35};
		int vet2[] = {22, 67, 48, 2, 93, 24, 25, 22, 18, 35};
		int vet3[] = {22, 67, 48, 2, 93, 24, 25, 22, 18, 35};
		
		BubbleSortDead bubble = new BubbleSortDead();
		InserctionSort inserct = new InserctionSort();
		SelectionSort select = new SelectionSort();
		BubbleSort link = new BubbleSort();
		
		bubble.sort(vet1);
		inserct.sort(vet2);
		select.sort(vet3);
		
		for(int x: vet1)
			System.out.printf("%d ", x);
		System.out.println();
		for(int x: vet2)
			System.out.printf("%d ", x);
		System.out.println();
		for(int x: vet3)
			System.out.printf("%d ", x);
		System.out.println();
		
		LinkedList list = new LinkedList(vet1);
		link.sort(list);
		
		for(int i = 0; i < list.size(); i++)
			System.out.printf("%d ", list.getValue(i));
		
		
	}

}
