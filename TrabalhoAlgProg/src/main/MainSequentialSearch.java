package main;

import java.io.IOException;

import util.FileRandom;
import util.LinkedList;
import util.Node;
import util.Search;

public class MainSequentialSearch {

	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		Search search = new Search();
		long time1 = 0, time2 = 0;
		int value;
		
		LinkedList list0 = file.reader("1000.txt"); //carrega valores do arquivo na lista
		LinkedList list1 = file.reader("100 - 1000.txt"); //carrega valores do arquivo na lista

		//verifica cada item da lista menor na maior
		for(Node nodeI = list1.get(0); nodeI != null; nodeI = nodeI.getNext()) {
			value = nodeI.getValue();
			time1 += System.nanoTime();
			search.sequential(list0, value);
			time2 += System.nanoTime();
		}
		
		System.out.println("  1.000 - Tempo: " + (time2 - time1));
		
		//////////////////////////////////
		time1 = 0;
		time2 = 0;
		
		LinkedList list2 = file.reader("5000.txt"); //carrega valores do arquivo na lista
		LinkedList list3 = file.reader("100 - 5000.txt"); //carrega valores do arquivo na lista

		//verifica cada item da lista menor na maior
		for(Node nodeI = list3.get(0); nodeI != null; nodeI = nodeI.getNext()) {
			value = nodeI.getValue();
			time1 += System.nanoTime();
			search.sequential(list2, value);
			time2 += System.nanoTime();
		}
		
		System.out.println("  5.000 - Tempo: " + (time2 - time1));
		
	//////////////////////////////////
	time1 = 0;
	time2 = 0;
	
	LinkedList list4 = file.reader("10000.txt"); //carrega valores do arquivo na lista
	LinkedList list5 = file.reader("100 - 10000.txt"); //carrega valores do arquivo na lista

	//verifica cada item da lista menor na maior
	for(Node node = list5.get(0); node != null; node = node.getNext()) {
		value = node.getValue();
		time1 += System.nanoTime();
		search.sequential(list4, value);
		time2 += System.nanoTime();
	}
	
	System.out.println(" 10.000 - Tempo: " + (time2 - time1));

	
	//////////////////////////////////
	time1 = 0;
	time2 = 0;
	
	LinkedList list6 = file.reader("20000.txt"); //carrega valores do arquivo na lista
	LinkedList list7 = file.reader("100 - 20000.txt"); //carrega valores do arquivo na lista

	//verifica cada item da lista menor na maior
	for(Node nodeI = list7.get(0); nodeI != null; nodeI = nodeI.getNext()) {
		value = nodeI.getValue();
		time1 += System.nanoTime();
		search.sequential(list6, value);
		time2 += System.nanoTime();
	}
	
	System.out.println(" 20.000 - Tempo: " + (time2 - time1));
	
	//////////////////////////////////
	time1 = 0;
	time2 = 0;
	
	LinkedList list8 = file.reader("50000.txt"); //carrega valores do arquivo na lista
	LinkedList list9 = file.reader("100 - 50000.txt"); //carrega valores do arquivo na lista

	//verifica cada item da lista menor na maior
	for(Node node = list9.get(0); node != null; node = node.getNext()) {
		value = node.getValue();
		time1 += System.nanoTime();
		search.sequential(list8, value);
		time2 += System.nanoTime();
	}
	
	System.out.println(" 50.000 - Tempo: " + (time2 - time1));

	//////////////////////////////////
	time1 = 0;
	time2 = 0;
	
	LinkedList list10 = file.reader("100000.txt"); //carrega valores do arquivo na lista
	LinkedList list11 = file.reader("100 - 100000.txt"); //carrega valores do arquivo na lista
	
	//verifica cada item da lista menor na maior
	for(Node node = list11.get(0); node != null; node = node.getNext()) {
		value = node.getValue();
		time1 += System.nanoTime();
		search.sequential(list10, value);
		time2 += System.nanoTime();
	}
	
	System.out.println("100.000 - Tempo: " + (time2 - time1));


	}

}
