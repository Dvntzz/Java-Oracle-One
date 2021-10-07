package br.com.java.io.teste;


import java.io.IOException;
import java.io.PrintStream;


public class EscritaPrintStreamWriter {
	public static void main(String[] args) throws IOException {
		
//		OutputStream ops = new FileOutputStream("Escrita com java.txt");
//		Writer osw = new OutputStreamWriter(ops);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("Escrita com java2.txt"));
		
		PrintStream ps = new PrintStream("Escrita com java 3");
		
		ps.println("pao de queijo");
		ps.println();
		ps.println("Bolo de cenoura");
		
		
		ps.close();
		
		
	}
}
