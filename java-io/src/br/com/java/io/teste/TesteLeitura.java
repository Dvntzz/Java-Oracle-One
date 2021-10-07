package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com arquivo
		
		//leitura do arquivo em binario
		FileInputStream fis = new FileInputStream("Java.txt");
		
		//melhorando a leitura de binarios para caracteres
		InputStreamReader leitor = new InputStreamReader(fis);
		
		//melhorando a leitura de caracteres para String
		BufferedReader br = new BufferedReader(leitor);
	
		String linha =  br.readLine();
		//while que so para de ler quando o readlina retornar null
		while(linha != null) {
			System.out.println(linha);
			linha =  br.readLine();
		}
		
		br.close();
		
	}
}
