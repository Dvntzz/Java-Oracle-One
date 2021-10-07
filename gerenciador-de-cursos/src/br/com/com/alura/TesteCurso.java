package br.com.com.alura;

public class TesteCurso {
	public static void main(String[] args) {		
		Curso JavaC = new Curso("Dominando coleções do Java", "Felipe Dantas");
		
		JavaC.adiciona(new Aula("Trabalhando com ArrayList", 15));
		JavaC.adiciona(new Aula("Criando uma aula", 21));
		JavaC.adiciona(new Aula("Modelando com coleções", 25));
		
		System.out.println(JavaC.getAulas());

		// JavaC.getAulas().add(new Aula("Trabalhando com ArrayList", 15));
		
	
	}
}
