package br.com.com.alura;

public class TestaCursoComAluno {
	public static void main(String[] args) {

		Curso JavaC = new Curso("Dominando coleções do Java", "Felipe Dantas");

		JavaC.adiciona(new Aula("Trabalhando com ArrayList", 15));
		JavaC.adiciona(new Aula("Criando uma aula", 21));
		JavaC.adiciona(new Aula("Modelando com coleções", 25));

		Aluno a1 = new Aluno("Albert Ainsten", 1852);
		Aluno a2 = new Aluno("Robinho Silva", 29654);
		Aluno a3 = new Aluno("Fauzer Santos", 37536);
		Aluno a4 = new Aluno("Madalena Pontes", 49514);

		JavaC.matricula(a1);
		JavaC.matricula(a2);
		JavaC.matricula(a3);
		JavaC.matricula(a4);

		System.out.println("Alunos matriculados: ");
		JavaC.getAlunos().forEach(Alunos -> {
			System.out.println(Alunos);
		});

			
		
		
	}
}
