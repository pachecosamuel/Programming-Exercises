package br.org.serratec;

import java.util.Arrays;

public class Contato {

	protected String nome; String telefoneVetor[];

	public Contato(String nome, String[] telefoneVetor) {
		this.nome = nome;
		this.telefoneVetor = telefoneVetor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getTelefoneVetor() {
		return telefoneVetor;
	}

	public void setTelefoneVetor(String[] telefoneVetor) {
		this.telefoneVetor = telefoneVetor;
	}


	
	
	
	

	
}
