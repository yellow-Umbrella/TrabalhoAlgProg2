package tests;

import java.io.IOException;

import sorting.InsertionSort;
import toDo.InsertionSortO;
import util.FileRandom;
import util.LinkedList;

public class InsertionSortTest {
	
	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		InsertionSort inserction = new InsertionSort();
		InsertionSortO inserctionO = new InsertionSortO();
		long time1, time2;
		long[] swapComp;
		////////////////////////////////////////////////////////////
		LinkedList list0 = file.reader("10.txt");

		time1 = System.nanoTime();
		swapComp = inserction.sort(list0);
		time2 = System.nanoTime();
		
		System.out.println("S/ O - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		System.out.println(list0);

		////////////////////////////////////////////////////////////
		LinkedList list1 = file.reader("10.txt");

		time1 = System.nanoTime();
		swapComp = inserctionO.sort(list1);
		time2 = System.nanoTime();
		
		System.out.println("C/ O - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		System.out.println(list1);
	}

}
