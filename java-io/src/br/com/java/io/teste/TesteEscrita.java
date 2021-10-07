package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		OutputStream ops = new FileOutputStream("Escrita com java.txt");
		Writer osw = new OutputStreamWriter(ops);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Deu Certo");
		bw.newLine();
		bw.write("Deu certo mexmo");
		
		bw.close();
		
		
	}
}
