package br.com.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {

		// Modo 1 de colocar objetos em um ArrayList
//		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
//		Aula a2 = new Aula("Lista de Objetos", 15);
//		Aula a3 = new Aula("Relacionamento de Lista e Objetos", 15);

		// criando uma ArrayList
		ArrayList<Aula> aulas = new ArrayList<>();

		// Adicionando os objetos do tipos aula ao mesmo tempo que são instanciados
		aulas.add(new Aula("Revisitando as ArrayLists", 21));
		aulas.add(new Aula("Lista de Objetos", 15));
		aulas.add(new Aula("Relacionamento de Lista e Objetos", 17));
		// ordem que foi adicionado
		System.out.println(aulas);

		// usando o collection para ordenar por ordem alfabetica
		Collections.sort(aulas);
		System.out.println(aulas);

		// usando o Colletcions para ordenar pelo tempo da aula
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);

	}

}
