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
		for (int i = 0; i < length; i++) {
			out.write(notEqual(path));
			if (i != length-1)
				out.newLine();
		}
		
		out.close();
	}
	
	private String notEqual(String path) throws IOException {
		Random rand = new Random();
		BufferedReader in = new BufferedReader(new FileReader(path));
		String line, aux = rand.nextInt(Integer.MAX_VALUE) + "";
		while ((line = in.readLine()) != null) { 
			if (line.equals(aux))
				notEqual(path);
		}
		in.close();
		return aux;
	}
}
