package main;

import java.io.IOException;
import sorting.BubbleSort;
import util.FileRandom;
import util.LinkedList;

public class MainBubble {
	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		BubbleSort bubble = new BubbleSort();
		long[][] time = new long[6][2];
		Long time1, time2;

		////////////////////////////////////////////////////////////
		LinkedList list0 = file.reader("1000.txt");

		time1 = System.nanoTime();
		bubble.sort(list0);
		time2 = System.nanoTime();

		time[0][0] = 1000; // Tamanho do vetor
		time[0][1] = (time2 - time1); // Tempo de ordenação
		// TODO arquivar lista ordenada e printar

		////////////////////////////////////////////////////////////
		LinkedList list1 = file.reader("5000.txt");

		time1 = System.nanoTime();
		bubble.sort(list1);
		time2 = System.nanoTime();

		time[1][0] = 5000; // Tamanho do vetor
		time[1][1] = (time2 - time1); // Tempo de ordenação
		// TODO arquivar lista ordenada e printar

		////////////////////////////////////////////////////////////
		LinkedList list2 = file.reader("10000.txt");

		time1 = System.nanoTime();
		bubble.sort(list2);
		time2 = System.nanoTime();

		time[2][0] = 10000; // Tamanho do vetor
		time[2][1] = (time2 - time1); // Tempo de ordenação
		// TODO arquivar lista ordenada e printar

		////////////////////////////////////////////////////////////
		LinkedList list3 = file.reader("20000.txt");

		time1 = System.nanoTime();
		bubble.sort(list3);
		time2 = System.nanoTime();

		time[3][0] = 20000; // Tamanho do vetor
		time[3][1] = (time2 - time1); // Tempo de ordenação
		// TODO arquivar lista ordenada e printar

		////////////////////////////////////////////////////////////
		LinkedList list4 = file.reader("50000.txt");

		time1 = System.nanoTime();
		bubble.sort(list4);
		time2 = System.nanoTime();

		time[4][0] = 50000; // Tamanho do vetor
		time[4][1] = (time2 - time1); // Tempo de ordenação
		// TODO arquivar lista ordenada e printar

		////////////////////////////////////////////////////////////
		LinkedList list5 = file.reader("100000.txt");

		time1 = System.nanoTime();
		bubble.sort(list5);
		time2 = System.nanoTime();

		time[5][0] = 100000; // Tamanho do vetor
		time[5][1] = (time2 - time1); // Tempo de ordenação
		// TODO arquivar lista ordenada e printar
		
		for (int i = 0; i < time.length; i++) {
			System.out.println(time[i][0] + " - " + time[i][1]);
		}
	}

}
