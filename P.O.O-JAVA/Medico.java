package br.org.serratec;

public class Medico extends Plano {

	protected String crm, nomeMedico;

	public Medico(String nome, String crm, String nomeMedico) {
		super(nome);
		this.crm = crm;
		this.nomeMedico = nomeMedico;
	}
	
	public String getCrm() {
		return crm;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "crm: " + crm + " nome m�dico: " + nomeMedico;
	}

	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() * 1.10;
		return valorPago;
	}
	
	
	
}
