package br.com.senai.model;

public class Medico {

	protected String crm, nome;
	protected double valorConsulta;
	
	public Medico(String crm, String nome, double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.valorConsulta = valorConsulta;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "crm: " + crm + "\n" + "nome: " + nome + "\nValor consulta: " + valorConsulta;
	}

	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}
	
	
	
}
