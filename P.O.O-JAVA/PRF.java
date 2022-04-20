package br.org.serratec;

public class PRF extends Policial {

	private String funcao;

	public PRF(String cpf, String nome, double salario, String lotacao, String funcao) {
		super(cpf, nome, salario, lotacao);
		this.funcao = funcao;
	}
	
	
	
}
