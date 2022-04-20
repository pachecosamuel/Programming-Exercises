/**
 * 
 */
package br.org.serratec;

/**
 * @author Samuel Pacheco
 *
 */
public class PessoaJuridica extends Pessoa implements Tributos {

	protected String cnpj, razaoSocial;

	public PessoaJuridica(String endereco, String nome, double rendimentos, String cnpj, String razaoSocial) {
		super(endereco, nome, rendimentos);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	
	
	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getRazaoSocial() {
		return razaoSocial;
	}



	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}



	@Override
	public double calculaIR() {
		return rendimentos * irendaPJ;
	}

	@Override
	public double calcularICMS() {
		return rendimentos * icms;
	}

}
