package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
	public static void main (String[] args) throws IOException {
		File file = new File("/TrabalhoAlgProg/CasosDeTeste/1000.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		out.write("teste");
		out.newLine();
		
		out.close();
	}
}
