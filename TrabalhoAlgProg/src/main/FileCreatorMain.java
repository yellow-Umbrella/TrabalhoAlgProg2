package main;

import java.io.IOException;
import java.util.Scanner;

import util.FileRandom;

public class FileCreatorMain {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileRandom file = new FileRandom();
		
		System.out.println("Digite exatamente este texto para continuar:");
		
		if("Digite exatamente este texto para continuar:".equals(scan.nextLine())) {
			
			// Cria os arquivos de (nome.txt, número de inteiros)
			
			file.writer("10.txt", 10);
			file.writer("1000.txt", 1000);
			file.writer("5000.txt", 5000);
			file.writer("10000.txt", 10000);
			file.writer("20000.txt", 20000);
			file.writer("50000.txt", 50000);
			file.writer("100000.txt", 100000);
			
			file.writer100("100 - 1000.txt", "1000.txt");
			file.writer100("100 - 5000.txt", "5000.txt");
			file.writer100("100 - 10000.txt", "10000.txt");
			file.writer100("100 - 20000.txt", "20000.txt");
			file.writer100("100 - 50000.txt", "50000.txt");
			file.writer100("100 - 100000.txt", "100000.txt");
		}
		
		
		scan.close();
	}

}
