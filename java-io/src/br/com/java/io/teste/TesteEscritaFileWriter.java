package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {
		
//		OutputStream ops = new FileOutputStream("Escrita com java.txt");
//		Writer osw = new OutputStreamWriter(ops);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Escrita com java2.txt"));
		
		bw.write("Deu certo");
		
		//bw.write(System.lineSeparator());
		bw.newLine();
		
		bw.write("Deu certo mesmo");
		
		bw.close();
		
		
	}
}
