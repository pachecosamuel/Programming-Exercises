package br.org.serratec;

public abstract class Pessoa {

	protected String endereco, nome;
	protected double rendimentos;

	public Pessoa(String endereco, String nome, double rendimentos) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Pessoa [endereco=" + endereco + ", nome=" + nome
				+ super.toString() + "]";
	}
	
	
	
}
