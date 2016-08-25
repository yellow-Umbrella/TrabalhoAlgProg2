package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileRandom {
	
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
		int[] vet = contains(length);
		
		for (int i = 0; i < length; i++) {
			out.write(vet[i] + "");
			if (i != length - 1)
				out.newLine();
			out.flush();
		}
		
		out.close();
	}

	private int[] contains(int length) throws IOException {
		Random rand = new Random();
		int aux;
		int[] vetN = new int[length];
		int auxLength = length*5;
		boolean[] vetB = new boolean[auxLength];
		
		for (int i = 0; i < length; i++) {
			do {
				aux = rand.nextInt(auxLength-1);
			} while(vetB[aux]);
			vetB[aux] = true;
			vetN[i] = aux; 
		}
		return vetN;
	}
	
			public void writer100(String pathOut, String pathIn) throws IOException {
				BufferedWriter out = new BufferedWriter(new FileWriter(pathOut));
				int[] vet = contains100(reader(pathIn));
				
				for (int i = 0; i < vet.length; i++) {
					out.write(vet[i] + ""); 
					if (i != vet.length-1)
						out.newLine();
					out.flush();
				}
				
				out.close();
			}
	
		private int[] contains100(LinkedList list) throws IOException { 
			Random rand = new Random();
			Search search = new Search();
			int aux;
			int[] vetN = new int[100];
			int auxLength = list.size()*5;
			boolean[] vetB = new boolean[auxLength];
			
			for (int i = 0; i < vetN.length; i++) {
				do {
					aux = rand.nextInt(auxLength-1);
				} while(vetB[aux] || !search.sequential(list, aux));
				vetB[aux] = true;
				vetN[i] = aux;
			}
			return vetN;
		}
}
