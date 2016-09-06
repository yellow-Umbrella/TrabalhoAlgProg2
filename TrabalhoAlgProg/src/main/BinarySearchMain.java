package main;

import java.io.IOException;

import sorting.MergeSort;
import util.FileRandom;
import util.LinkedList;
import util.Search;
import util.Node;

public class BinarySearchMain {

	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		MergeSort merge = new MergeSort();
		Search search = new Search();
		long time1, time2;
		
		//carrega valores dos arquivos nas listas
		LinkedList list1 = file.reader("1000.txt"), list5 = file.reader("5000.txt"), list10 = file.reader("10000.txt");
		LinkedList list20 = file.reader("20000.txt"), list50 = file.reader("50000.txt"), list100 = file.reader("100000.txt");
		
		//carrega valores dos arquivos nas listas
		LinkedList listB1 = file.reader("100 - 1000.txt"), listB5 = file.reader("100 - 5000.txt"), listB10 = file.reader("100 - 10000.txt");
		LinkedList listB20 = file.reader("100 - 20000.txt"), listB50 = file.reader("100 - 50000.txt"), listB100 = file.reader("100 - 100000.txt");
		
		//ordena as listas
		merge.sort(list1);
		merge.sort(list5);
		merge.sort(list10);
		merge.sort(list20);
		merge.sort(list50);
		merge.sort(list100);
		
		time1 = 0;
		time2 = 0;
		for(Node no = listB1.getHead(); no.getNext() != null; no = no.getNext()) { //verifica cada item da lista menor na maior
			time1 += System.nanoTime();
			search.binary(list1, no.getValue());
			time2 += System.nanoTime();
		}
		System.out.println("  1.000: " + (time2 - time1));
/////////////////
		time1 = 0;
		time2 = 0;
		for(Node no = listB5.getHead(); no.getNext() != null; no = no.getNext()) { //verifica cada item da lista menor na maior
			time1 += System.nanoTime();
			search.binary(list5, no.getValue());
			time2 += System.nanoTime();
		}
		System.out.println("  5.000: " + (time2 - time1));
/////////////////
		time1 = 0;
		time2 = 0;
		for(Node no = listB10.getHead(); no.getNext() != null; no = no.getNext()) { //verifica cada item da lista menor na maior
			time1 += System.nanoTime();
			search.binary(list10, no.getValue());
			time2 += System.nanoTime();
		}
		System.out.println(" 10.000: " + (time2 - time1));
/////////////////
		time1 = 0;
		time2 = 0;
		for(Node no = listB20.getHead(); no.getNext() != null; no = no.getNext()) { //verifica cada item da lista menor na maior
			time1 += System.nanoTime();
			search.binary(list20, no.getValue());
			time2 += System.nanoTime();
		}
		System.out.println(" 20.000: " + (time2 - time1));
/////////////////
		time1 = 0;
		time2 = 0;
		for(Node no = listB50.getHead(); no.getNext() != null; no = no.getNext()) { //verifica cada item da lista menor na maior
			time1 += System.nanoTime();
			search.binary(list50, no.getValue());
			time2 += System.nanoTime();
		}
		System.out.println(" 50.000: " + (time2 - time1));
/////////////////
		time1 = 0;
		time2 = 0;
		for(Node no = listB100.getHead(); no.getNext() != null; no = no.getNext()) { //verifica cada item da lista menor na maior
			time1 += System.nanoTime();
			search.binary(list100, no.getValue());
			time2 += System.nanoTime();
		}
		System.out.println("100.000: " + (time2 - time1));
	}

}
