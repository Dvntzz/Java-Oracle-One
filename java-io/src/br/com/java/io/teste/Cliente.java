package br.com.java.io.teste;

import java.io.Serializable;

/**
 * 
 * @author Felipe Dantas
 * @version 0.1
 * 
 * Está classe é um modelo de cliente do ByteBank
 *  
 * 
 */

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4441891998131067604L;
	private String nome;	
	private String CPF;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}



	