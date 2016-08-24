package tests;

import java.io.IOException;

import sorting.InserctionSort;
import util.FileRandom;
import util.LinkedList;

public class BubbleSortTest {
	
	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		LinkedList list = file.reader("10.txt");

		//BubbleSort bubble = new BubbleSort();
		//BubbleSortO bubbleO = new BubbleSortO();
		System.out.println(list);
		InserctionSort inserction = new InserctionSort();
		inserction.sort(list);
		//bubble.sort(list);
		//bubbleO.sort(list);
		System.out.println(list);
	
	
	}

}
