package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaNoConsole {
	public static void main(String[] args) throws IOException {
		//Leitura
		InputStream fis = System.in;
		InputStreamReader leitor = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(leitor);
		
		//Escrita
		OutputStream ops = new FileOutputStream("EscrevendoDoConsole.txt");
		Writer osw = new OutputStreamWriter(ops);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha =  br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha =  br.readLine();
		}
		
		br.close();
		bw.close();
	}
}
