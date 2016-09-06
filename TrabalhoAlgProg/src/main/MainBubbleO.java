package main;

import java.io.IOException;

import sorting.BubbleSort;
import sorting.BubbleSortO;
import util.FileRandom;
import util.LinkedList;
import util.TestaOrdenacao;

public class MainBubbleO {

	public static void main(String[] args) throws IOException {
		TestaOrdenacao test = new TestaOrdenacao(); //Objeto que testa se a lista realmente foi ordenada.
		FileRandom file = new FileRandom(); //Objeto que le os números dos arquivos préviamente gerados.
		BubbleSortO bubble = new BubbleSortO(); //Objeto que possui o método que ordena usando o BubbleSort Optimizado.
		Long time1, time2; //Tempo antes e depois da ordenação.
		long[] swapComp; //Contadores de trocas e comparações.
		////////////////////////////////////////////////////////////
		
		// Lista recebe os 1000 números do arquivo 1000.txt, pega o tempo antes da ordenação, ordena pelo Bubblesort Optimizado
		// e pega o tempo depois.
		// Em seguida verifica se a lista realmente foi ordenada.
		
		LinkedList list0 = file.reader("1000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list0);
		time2 = System.nanoTime();
		test.testar(list0);
		System.out.println("  1.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list0);

		////////////////////////////////////////////////////////////
		
		//Repete as ações anteriores com o arquivo 5000.txt.
		
		LinkedList list1 = file.reader("5000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list1);
		time2 = System.nanoTime();
		test.testar(list1);
		System.out.println("  5.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list1);

		////////////////////////////////////////////////////////////
		
		//Repete as ações anteriores com o arquivo 10000.txt.
		
		LinkedList list2 = file.reader("10000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list2);
		time2 = System.nanoTime();
		test.testar(list2);
		System.out.println(" 10.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list2);

		////////////////////////////////////////////////////////////
		
		//Repete as ações anteriores com o arquivo 20000.txt.
		
		LinkedList list3 = file.reader("20000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list3);
		time2 = System.nanoTime();
		test.testar(list3);
		System.out.println(" 20.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list3);

		////////////////////////////////////////////////////////////
		
		//Repete as ações anteriores com o arquivo 50000.txt.
		
		LinkedList list4 = file.reader("50000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list4);
		time2 = System.nanoTime();
		test.testar(list4);
		System.out.println(" 50.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list4);

		////////////////////////////////////////////////////////////
		
		//Repete as ações anteriores com o arquivo 100000.txt.
		
		LinkedList list5 = file.reader("100000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list5);
		time2 = System.nanoTime();
		test.testar(list5);
		System.out.println("100.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list5);
	}

}
