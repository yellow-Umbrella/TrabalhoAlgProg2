package main;

import java.io.IOException;

import mainAux.TestaOrdenacao;
import sorting.BubbleSort;
import util.FileRandom;
import util.LinkedList;

public class MainBubble {
	public static void main(String[] args) throws IOException {
		TestaOrdenacao test = new TestaOrdenacao(); //Objeto que confere se a lista realmente esta ordenada.
		FileRandom file = new FileRandom();
		BubbleSort bubble = new BubbleSort(); //Objeto com o método de ordenar BubbleSort.
		Long time1, time2; //Tempo antes e depois da ordenação.
		long[] swapComp;
		////////////////////////////////////////////////////////////
		LinkedList list0 = file.reader("1000.txt"); //Lista recebe os 1000 números do arquivo 1000.txt.

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação
		swapComp = bubble.sort(list0); //Ordena a lista e retorna quantas comparações e swaps ocorreram.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list0); //Verifica se a lista realmente foi ordenada.
		System.out.println("  1.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list0);

		////////////////////////////////////////////////////////////
		LinkedList list1 = file.reader("5000.txt"); //Lista recebe os 5.000 números do arquivo 5000.txt.

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação.
		swapComp = bubble.sort(list1); //Ordena a lista e retorna quantas comparações e swaps ocorreram.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list1); //Verifica se a lista realmente foi ordenada.
		System.out.println("  5.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list1);

		////////////////////////////////////////////////////////////
		LinkedList list2 = file.reader("10000.txt"); //Lista recebe os 10.000 números do arquivo 10000.txt

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação.
		swapComp = bubble.sort(list2); //Ordena a lista e retorna quantas comparações e swaps ocorreram.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list2); //Verifica se a lista realemnte foi ordenada.
		System.out.println(" 10.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list2);

		////////////////////////////////////////////////////////////
		LinkedList list3 = file.reader("20000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list3);
		time2 = System.nanoTime();
		test.testar(list3);
		System.out.println(" 20.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list3);

		////////////////////////////////////////////////////////////
		LinkedList list4 = file.reader("50000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list4);
		time2 = System.nanoTime();
		test.testar(list4);
		System.out.println(" 50.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list4);

		////////////////////////////////////////////////////////////
		LinkedList list5 = file.reader("100000.txt");

		time1 = System.nanoTime();
		swapComp = bubble.sort(list5);
		time2 = System.nanoTime();
		test.testar(list5);
		System.out.println("100.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list5);
		
	}

}
