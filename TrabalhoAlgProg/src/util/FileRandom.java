package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileRandom {
	private int posicao = 0;
	
	public LinkedList reader(String path) throws IOException {
		LinkedList list = new LinkedList();
        BufferedReader in = new BufferedReader(new FileReader(path));
        String line;
        while ((line = in.readLine()) != null) {
        	list.add(Integer.parseInt(line));
        }
        in.close();
        return list;
    }
	
	public void writer(String path, int length) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path));
		int[] vet = new int[length];
		this.posicao = 0;
		for (int i = 0; i < length; i++) {
			out.write(notEqual(vet));
			if (i != length-1)
				out.newLine();
			out.flush();
		}
		
		out.close();
	}
	
	private String notEqual(int[] vet) throws IOException {
		Random rand = new Random();
		int aux = rand.nextInt(10);//Integer.MAX_VALUE 
		
		for (int i = 0; i < posicao; i++) {
			if(vet[i] == aux)
				return notEqual(vet);
		}
		vet[posicao] = aux;
		posicao++;
		return aux + "";
	}
}
