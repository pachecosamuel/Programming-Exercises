package br.com.senai.model;

public class PessoaJuridica extends ImpostoDeRenda {

	protected String cnpj, inscEstadual;
	
	public PessoaJuridica(String nome, String telefone, String email, 
			double rendimentos, String cnpj, String inscEstadual) {
		
		super(nome, telefone, email, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	public double calcularIR() {
		return this.rendimentos * 0.15;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", nome=" + nome + ", rendimentos=" + rendimentos + ", calcularIR()="
				+ calcularIR() + "]";
	}
	
	
	
	
}
