package main;

import java.io.IOException;

import toDo.MergeSort;
import util.FileRandom;
import util.LinkedList;

public class MainMerge {

	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		MergeSort merge = new MergeSort();
		Long time1, time2;
		long[] swapComp;
		////////////////////////////////////////////////////////////
		LinkedList list0 = file.reader("1000.txt");

		time1 = System.nanoTime();
		swapComp = merge.sort(list0);
		time2 = System.nanoTime();
		
		System.out.println("  1.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list0);

		////////////////////////////////////////////////////////////
		LinkedList list1 = file.reader("5000.txt");

		time1 = System.nanoTime();
		swapComp = merge.sort(list1);
		time2 = System.nanoTime();

		System.out.println("  5.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list1);

		////////////////////////////////////////////////////////////
		LinkedList list2 = file.reader("10000.txt");

		time1 = System.nanoTime();
		swapComp = merge.sort(list2);
		time2 = System.nanoTime();

		System.out.println(" 10.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list2);

		////////////////////////////////////////////////////////////
		LinkedList list3 = file.reader("20000.txt");

		time1 = System.nanoTime();
		swapComp = merge.sort(list3);
		time2 = System.nanoTime();

		System.out.println(" 20.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list3);

		////////////////////////////////////////////////////////////
		LinkedList list4 = file.reader("50000.txt");

		time1 = System.nanoTime();
		swapComp = merge.sort(list4);
		time2 = System.nanoTime();

		System.out.println(" 50.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list4);

		////////////////////////////////////////////////////////////
		LinkedList list5 = file.reader("100000.txt");

		time1 = System.nanoTime();
		swapComp = merge.sort(list5);
		time2 = System.nanoTime();

		System.out.println("100.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list5);
		
	}

}