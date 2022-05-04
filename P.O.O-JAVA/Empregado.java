package br.org.serratec.model;

import java.util.Objects;

public class Empregado {

	private String nome, profissao;

	public Empregado(String nome, String profissao) {
		super();
		this.nome = nome;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", profissao=" + profissao + "]";
	}



	
	
	
}
