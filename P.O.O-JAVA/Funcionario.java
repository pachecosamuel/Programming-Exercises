package org.serratec.model;

public class Funcionario {

	private String name;
	private double salario;
	private static int qtdFuncionarios;
	
	public Funcionario(String name, double salario) {
		this.name = name;
		this.salario = salario;
		qtdFuncionarios++;
	}
	
	public static int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public static void setQtdFuncionarios(int qtdFuncionarios) {
		Funcionario.qtdFuncionarios = qtdFuncionarios;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularINSS(double salario) {
		return salario * 0.11;
	}
	
	public double calcularVT(double salario) {
		return salario * 0.06;
	}

	
	
	
	
}
