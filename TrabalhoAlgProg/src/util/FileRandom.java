package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileRandom {
	private int posicao = 0; // variável útil para criação de arquivo sem repetição
	
	// Lê um arquivo e adiciona os elementos à lista
	public LinkedList reader(String path) throws IOException { // recebe (endereço.txt)
		LinkedList list = new LinkedList();
        BufferedReader in = new BufferedReader(new FileReader(path));
        String line;
        while ((line = in.readLine()) != null) {
        	list.add(Integer.parseInt(line));
        }
        in.close();
        return list;
    }
	
	// Escreve em um arquivo inteiros não repetidos
	public void writer(String path, int length) throws IOException { // recebe (endeço.txt, número de inteiros)
		BufferedWriter out = new BufferedWriter(new FileWriter(path));
		int[] vet = new int[length]; // vetor para verificação de repetições
		this.posicao = 0; // inicia a escrita do vetor na posicao 0
		
		for (int i = 0; i < length; i++) {
			out.write(notEqual(vet)); // adicina no arquivo o valor criado pelo método notEqual
			if (i != length-1)
				out.newLine(); // adiciona quebra de linha no arquivo
			out.flush();
		}
		
		out.close();
	}
	
	// Valida o valor antes de ser escrito no arquivo
	private String notEqual(int[] vet) throws IOException { // recebe o vetor com os demais valores do arquivo
		Random rand = new Random();
		int aux = rand.nextInt(Integer.MAX_VALUE); // variável recebe um valor randômico inteiro de 0 a MAX_VALUE
		
		for (int i = 0; i < posicao; i++) { // percorre o vetor
			if(vet[i] == aux) // se valor já existe no vetor, chama notEqual novamente
				return notEqual(vet);
		}
		vet[posicao] = aux; // adiciona variável no vetor[posicao]
		posicao++; // incrementa posicao
		return aux + ""; // retorna variável no farmato de String
	}
}
