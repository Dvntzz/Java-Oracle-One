package teste;

import java.util.Scanner;

public class teste {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite aqui um numero: ");
		int n1 = sc.nextInt();
		
		System.out.println("você digitou: "+n1);
		
		sc.close();
	}
}
