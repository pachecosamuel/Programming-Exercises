package br.org.serratec;

public class PessoaFisica extends Pessoa implements Tributos {

	protected String cpf;

	public PessoaFisica(String endereco, String nome, double rendimentos, String cpf) {
		super(endereco, nome, rendimentos);
		this.cpf = cpf;
	}

	
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	@Override
	public double calculaIR() {
		return rendimentos * irendaPF;
	}

	@Override
	public double calcularICMS() {
		// TODO Auto-generated method stub
		return 0;
	}

}
