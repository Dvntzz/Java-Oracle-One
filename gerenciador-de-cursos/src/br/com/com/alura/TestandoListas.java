package br.com.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
			String aula1 = "Trabalhando com ArrayList";
			String aula2 = "Lista de objetos";
			String aula3 = "Relacionamentos com coleções";
			String aula4 = "Aumentando nosso conhecimento";

			
			ArrayList<String> aulas = new ArrayList<>();
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);
			aulas.add(aula4);
			
//			System.out.println(aulas);
//			aulas.remove(0);
//			System.out.println(aulas);
			
			//para cada string aula dentro de aulas faça
			
			for (String aula : aulas) {
				System.out.println("Aula: "+ aula);
			}
			
			//removendo a aula na posilçao 0
			aulas.remove(0);
			
			String primeiraAula = aulas.get(0);
			System.out.println("primeira aula é: "+ primeiraAula);
			
			
			for(int i = 0; i < aulas.size(); i++) {
				System.out.println("aula: "+aulas.get(i));
			}
			
			//mosta o tamanho do ArrayList
			System.out.println(aulas.size());
			
			//foreach dentro do array list usando lambda
			aulas.forEach(aula -> {
				System.out.println("percorrendo: "+ aula);
				}
			);

			
			System.out.println("antes do sort: "+aulas);
			Collections.sort(aulas);
			System.out.println("após o sort: "+aulas);
			
			
	}
}
