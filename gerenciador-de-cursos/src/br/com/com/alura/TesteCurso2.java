package br.com.com.alura;

import java.util.List;

public class TesteCurso2 {
	public static void main(String[] args) {
		Curso JavaC = new Curso("Dominando coleções do Java", "Felipe Dantas");

		JavaC.adiciona(new Aula("Trabalhando com ArrayList", 15));
		JavaC.adiciona(new Aula("Criando uma aula", 21));
		JavaC.adiciona(new Aula("Modelando com coleções", 25));

		List<Aula> aulas = JavaC.getAulas();
		System.out.println(aulas);

		System.out.println(JavaC.getTempoTotal());
		System.out.println(JavaC);

	}
}
