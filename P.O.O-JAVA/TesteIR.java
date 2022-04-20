package br.com.senai.model;

public class TesteIR {

	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica("Samuel", "24992156968", "p@gmail.com", 19562.30, "100123456", "23925634");
		PessoaJuridica p2 = new PessoaJuridica("Tech Dream", "40028922", "corp@gmai.com", 550050.23, "852582", "RJ");
		
		System.out.println("O valor do IR para PF é: " + p1.calcularIR() + "\nO valor do IR para PJ é: " + p2.calcularIR());

		System.out.println(p1.toString());
		System.out.println(p2.toString());	
		
	}

}
