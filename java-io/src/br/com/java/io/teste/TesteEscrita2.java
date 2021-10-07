package br.com.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File("contas.csv"));		
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			//System.out.println(linha);
			
			Scanner sca = new Scanner(linha);
			sca.useLocale(Locale.US);
			sca.useDelimiter(",");
			
			String TipoConta = sca.next();
			int agencia = sca.nextInt();
			int conta = sca.nextInt();
			String Titular = sca.next();
			Double saldo = sca.nextDouble();
			
			String valorFormatado = String.format(new Locale("pt","BR") ,"%s-%04d, %04d  %20s: R$ %05.2f",
			TipoConta,conta,agencia,Titular,saldo);
			
			
			System.out.println(valorFormatado);

//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
			sca.close();
		}
		
		
		sc.close();
		
	}
}
