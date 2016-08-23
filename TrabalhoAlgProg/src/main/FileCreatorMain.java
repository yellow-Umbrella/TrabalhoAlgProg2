package main;

import java.io.IOException;

import util.FileRandom;

public class FileCreatorMain {

	public static void main(String[] args) throws IOException {
		FileRandom file = new FileRandom();
		
		// Cria os arquivos de (nome.txt, número de inteiros)
		
		file.writer("1000.txt", 1000);
		
		file.writer("5000.txt", 5000);
		
		file.writer("10000.txt", 10000);
		
		file.writer("20000.txt", 20000);
		
		file.writer("50000.txt", 50000);
		
		file.writer("100000.txt", 100000);
		
	}

}
