package br.com.senai.model;

public class ImpostoDeRenda {

	protected String nome, telefone, email;
	protected double rendimentos;

	public ImpostoDeRenda(String nome, String telefone, String email, double rendimentos) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "ImpostoDeRenda [nome=" + nome + ", rendimentos=" + rendimentos + "]";
	}
	
	
	 
}
