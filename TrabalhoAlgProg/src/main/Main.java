package main;

import java.io.IOException;

import linkedSort.BubbleLinked;
import util.FileRandom;
import util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		LinkedList list = file.reader("1000.txt");
		BubbleLinked bubble = new BubbleLinked();
		bubble.sort(list);
		System.out.println(list.size());
		System.out.println(list);
		
		
	}

}
