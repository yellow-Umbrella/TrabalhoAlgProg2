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
        return list;
    }
	
	public void writer(String path, int length) throws IOException {
		Random rand = new Random();
		BufferedWriter out = new BufferedWriter(new FileWriter(path));
		for (int i = 0; i < length; i++) {
			out.write(rand.nextInt(Integer.MAX_VALUE) + "");
			if (i != length-1)
				out.newLine();
		}
		
		out.close();
	}
}
