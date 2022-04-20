package org.serratec.model;

public class Medico {

	private String crm, nome;
	private double salario, consulta;
	private static int totalMedicos;
	
	public Medico(String nome, String crm, double salario, double consulta) {
		this.nome = nome;
		this.crm = crm;
		this.salario = salario;
		this.consulta = consulta;
		totalMedicos ++;
	}
	
	public void pagamentoDinheiro(double consulta) {
		salario += consulta;
	}

	public void pagamentoPlano(double consulta) {
		salario += consulta * 0.7;
	}
	
	public static int getTotalMedicos() {
		return totalMedicos;
	}

	public static void setTotalMedicos(int totalMedicos) {
		Medico.totalMedicos = totalMedicos;
	}


	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getConsulta() {
		return consulta;
	}

	public void setConsulta(double consulta) {
		this.consulta = consulta;
	}
	
	
	
	
}
