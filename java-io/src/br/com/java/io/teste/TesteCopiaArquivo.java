package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiaArquivo {
	public static void main(String[] args) throws IOException {
		
				FileInputStream fis = new FileInputStream("Java.txt");
				InputStreamReader leitor = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(leitor);
				
				OutputStream ops = new FileOutputStream("CopiaDeArquivoComJava.txt");
				Writer osw = new OutputStreamWriter(ops);
				BufferedWriter bw = new BufferedWriter(osw);
				
			
				String linha =  br.readLine();
				
				while(linha != null) {
					bw.write(linha);
					bw.newLine();
					linha =  br.readLine();
				}
				
				br.close();
				bw.close();
	}
}
