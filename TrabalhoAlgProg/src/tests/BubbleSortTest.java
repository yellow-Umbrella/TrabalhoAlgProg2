package tests;

import java.io.IOException;
import java.util.Scanner;

import sorting.InserctionSort;
import util.FileRandom;
import util.LinkedList;
import util.Search;

public class BubbleSortTest {
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileRandom file = new FileRandom();
		LinkedList list = file.reader("10.txt");
		Search busca = new Search();
		
		//BubbleSort bubble = new BubbleSort();
		//BubbleSortO bubbleO = new BubbleSortO();
		System.out.println(list);
		InserctionSort inserction = new InserctionSort();
		inserction.sort(list);
		//bubble.sort(list);
		//bubbleO.sort(list);
		System.out.println(list);

		System.out.println(list.size());
		
		System.out.println(busca.sequential(list, scan.nextInt()));
		System.out.println(busca.binary(list, scan.nextInt()));
		
		scan.close();
	}

}
