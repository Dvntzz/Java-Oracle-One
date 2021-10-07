package br.com.com.alura;

public class Aluno {
	private String nome;
	private int matricula;

	public Aluno(String nome, int matricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode estar vazio");
		}
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public boolean equals(Object obj) {
		Aluno outra = (Aluno) obj;
		return this.nome.equals(outra.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public String toString() {
		return "Matricula: " + matricula + " - " + nome;
	}

}
