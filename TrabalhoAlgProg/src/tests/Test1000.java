package tests;

import java.io.IOException;

import linkedSort.BubbleSort;
import util.FileRandom;
import util.LinkedList;

public class Test1000 {
	
	public static void main(String[] args) throws IOException {
		Long nano1 = System.currentTimeMillis();
		
		FileRandom file = new FileRandom();
		LinkedList list = file.reader("1000.txt");
		BubbleSort bubble = new BubbleSort();
		bubble.sort(list);
		System.out.println(list.size());
		System.out.println(list);
		
		Long nano2 = System.currentTimeMillis();
		System.out.println(nano2 - nano1);
	}

}
