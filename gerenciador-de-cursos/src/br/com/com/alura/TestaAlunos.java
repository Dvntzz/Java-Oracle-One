package br.com.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Felipe Dantas");
		alunos.add("Maria Jos�");
		alunos.add("Marco Almeida");
		alunos.add("Julia Batista");
		alunos.add("Wendel Lira");
		alunos.add("Jefferson santos");
		
		System.out.println(alunos.size());
		System.out.println(alunos);
		
		//Mesmo adicionando uma nova String o Set n�o mudara de tamanho
		//Pois ele n�o aceita objetos repetidos
		alunos.add("Jefferson santos");
		System.out.println(alunos.size());
	}
}
