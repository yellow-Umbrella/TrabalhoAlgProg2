package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileRandom {
	
	// L� um arquivo e adiciona os elementos � lista
	public LinkedList reader(String path) throws IOException { // recebe (endere�o.txt)
		LinkedList list = new LinkedList();
        BufferedReader in = new BufferedReader(new FileReader(path));
        String line;
        while ((line = in.readLine()) != null) {
        	list.add(Integer.parseInt(line));
        }
        in.close();
        return list;
    }
	
	// Escreve em um arquivo inteiros n�o repetidos
	public void writer(String path, int length) throws IOException { // recebe (ende�o.txt, n�mero de inteiros)
		BufferedWriter out = new BufferedWriter(new FileWriter(path));
		length *= 10;
		boolean[] vet = new boolean[length]; // vetor para verifica��o de repeti��es
		
		for (int i = 0; i < length; i++) {
			out.write(contains(vet, length)); // adicina no arquivo o valor criado pelo m�todo notEqual
			if (i != length-1)
				out.newLine(); // adiciona quebra de linha no arquivo
			out.flush();
		}
		
		out.close();
	}
	
	// Valida o valor antes de ser escrito no arquivo
	private String contains(boolean[] vet, int length) throws IOException { // recebe o vetor com os demais valores do arquivo
		Random rand = new Random();
		int aux = rand.nextInt(length-1); // vari�vel recebe um valor rand�mico inteiro de 0 a length
		if (vet[aux] == false)
			vet[aux] = true; // adiciona vari�vel
		else
			return contains(vet, length); // tenta outro n�mero
		return aux + ""; // retorna vari�vel no farmato de String
	}
}
