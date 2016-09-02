package main;

import java.io.IOException;

import mainAux.TestaOrdenacao;
import sorting.BubbleSort;
import sorting.BubbleSortO;
import util.FileRandom;
import util.LinkedList;

public class MainBubbleO {

	public static void main(String[] args) throws IOException {
		TestaOrdenacao test = new TestaOrdenacao(); //Objeto que testa se a lista realmente foi ordenada.
		FileRandom file = new FileRandom(); //Objeto que le os números dos arquivos préviamente gerados.
		BubbleSortO bubble = new BubbleSortO(); //Objeto que possui o método que ordena usando o BubbleSort Optimizado.
		Long time1, time2; //Tempo antes e depois da ordenação.
		long[] swapComp; //Contadores de trocas e comparações.
		////////////////////////////////////////////////////////////
		LinkedList list0 = file.reader("1000.txt"); //Lista recebe os 1.000 números do arquivo 1000.txt.

		time1 = System.nanoTime(); //Pega tempo antes da ordenação.
		swapComp = bubble.sort(list0); //Ordena a lista e retorna a quantidade de trocas e comparações.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list0); //Verifica se a lista realmente foi ordenada.
		System.out.println("  1.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list0);

		////////////////////////////////////////////////////////////
		LinkedList list1 = file.reader("5000.txt"); //Lista recebe os 5.000 números do arquivo 5000.txt.

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação.
		swapComp = bubble.sort(list1); //Ordena a lista e retorna a quantidade de comparações e trocas.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list1); //Verifica se a lista realmente foi ordenada.
		System.out.println("  5.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list1);

		////////////////////////////////////////////////////////////
		LinkedList list2 = file.reader("10000.txt"); //Lista recebe os 10.000 números do arquivo 10000.txt.

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação.
		swapComp = bubble.sort(list2); //Ordena a lista e retorna a quantidade de trocas e comparações.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list2); //Verifica se a lista realmente foi ordenada.
		System.out.println(" 10.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list2);

		////////////////////////////////////////////////////////////
		LinkedList list3 = file.reader("20000.txt"); //Lista recebe os 20.000 números do arquivo 20000.txt.

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação.
		swapComp = bubble.sort(list3); //Ordena a lista e recebe a quantidade de trocas e comparações.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list3); //Verifica se a lista esta ordenada.
		System.out.println(" 20.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list3);

		////////////////////////////////////////////////////////////
		LinkedList list4 = file.reader("50000.txt"); //Lista recebe os 50.000 números do arquivo 50000.txt.

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação.
		swapComp = bubble.sort(list4); //Ordena e retorna a quantidade de trocas e comprações.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list4); //Verifica se a lista esta ordenada.
		System.out.println(" 50.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list4);

		////////////////////////////////////////////////////////////
		LinkedList list5 = file.reader("100000.txt"); //Lista recebe 100.000 números do arquivo 100000.txt.

		time1 = System.nanoTime(); //Pega o tempo antes da ordenação.
		swapComp = bubble.sort(list5); //Ordena a lista e retorna a quantidade de trocas e comparações.
		time2 = System.nanoTime(); //Pega o tempo depois da ordenação.
		test.testar(list5); //Verifica se a lista realmente esta ordenada.
		System.out.println("100.000 - Tempo: " + (time2 - time1) + " Trocas: " + swapComp[0] + " Comparacoes: " + swapComp[1]);
		//System.out.println(list5);
	}

}
