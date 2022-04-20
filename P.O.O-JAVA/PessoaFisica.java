package br.com.senai.model;

public class PessoaFisica extends ImpostoDeRenda {

	protected String cpf, rg;

	public PessoaFisica(String nome, String telefone, String email, double rendimentos, String cpf, String rg) {
		
		super(nome, telefone, email, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public double calcularIR() {
		return this.rendimentos * 0.12;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", rendimentos=" + rendimentos + ", calcularIR()="
				+ calcularIR() + "]";
	}
	
	


	

	
	
}
