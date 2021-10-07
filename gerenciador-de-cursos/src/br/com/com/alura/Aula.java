package br.com.com.alura;

public class Aula implements Comparable<Aula> {

	public String titulo;
	public int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + "min]";
	}

	@Override
	public int compareTo(Aula OutraAula) {
		return this.titulo.compareTo(OutraAula.titulo);
	}
}
