package tests;

import java.io.IOException;

import sorting.BubbleSort;
import util.FileRandom;
import util.LinkedList;

public class BubbleSortTest {
	
	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		LinkedList list = file.reader("10.txt");
		BubbleSort bubble = new BubbleSort();
		
		System.out.println(list);
		
		bubble.sort(list);
		
		System.out.println(list);
		
	
	
	}

}
