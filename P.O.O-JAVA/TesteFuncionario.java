package org.serratec.model;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Samuel", 25690.50);
		Funcionario f2 = new Funcionario("Tales", 19562.50);
		
		JOptionPane.showMessageDialog(null, "Nome: " + f1.getName() + "\n" + "Salário: " + f1.getSalario() +
				"\n" + "INSS: " + f1.calcularINSS(f1.getSalario()) + "\n" + "VT: " + f1.calcularVT(f1.getSalario()) +
				"\n" +"Salário líquido: " + (f1.getSalario() - f1.calcularINSS(f1.getSalario()) - f1.calcularVT(f1.getSalario()))+ "\n");

		JOptionPane.showMessageDialog(null, "Nome: " + f2.getName() + "\n" + "Salário: " + f2.getSalario() +
				"\n" + "INSS: " + f2.calcularINSS(f2.getSalario()) + "\n" + "VT: " + f2.calcularVT(f2.getSalario()) +
				"\n" +"Salário líquido: " + (f2.getSalario() - f2.calcularINSS(f2.getSalario()) - f2.calcularVT(f2.getSalario()))+ "\n");
		
		JOptionPane.showMessageDialog(null, "A quantidade de funcionários cadastrados é de: " + Funcionario.getQtdFuncionarios());

	}

}
