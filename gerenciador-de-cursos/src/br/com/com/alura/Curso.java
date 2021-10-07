package br.com.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<>();
	private Map<Integer, Aluno> MatriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		// criando uma copia da lista que é imutavel
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int TempoTotal = 0;
		for (Aula aula : aulas) {
			TempoTotal += aula.getTempo();
		}
		return TempoTotal;
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", carga horaria " + this.getTempoTotal() + "h, Aulas: " + getAulas();
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.MatriculaParaAluno.put(aluno.getMatricula(), aluno);
	}

	public Aluno EstaMatriculado(int i) {
		return MatriculaParaAluno.get(i);
	}

}
