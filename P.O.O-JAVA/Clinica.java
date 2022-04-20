package br.org.serratec;

public class Clinica extends Plano {

	protected String nomeClinica, cnpj;

	public Clinica(String nome, String nomeClinica, String cnpj) {
		super(nome);
		this.nomeClinica = nomeClinica;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Nome clínica: " + nomeClinica + "CNPJ" + cnpj;
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public String getCnpj() {
		return cnpj;
	}

	
	
	
	
}
