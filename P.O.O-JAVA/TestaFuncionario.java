package br.org.serratec;

public class TestaFuncionario {
	public static void main(String[] args) {

		/*
		 * Funcionario f1 = new Funcionario("Samuel", "Tech Lead", 19000); Funcionario
		 * f2 = new Funcionario("João", "Dev-ops", 15000);
		 * 
		 * f1.abono(150); f2.abono(150);
		 * 
		 * String[] trabalhado = { f1.getNome(), f1.getCargo(), f2.getNome(),
		 * f2.getCargo()};
		 * 
		 * System.out.println("Nome: " + trabalhado[0] + " Salário: " +
		 * f1.getSalario()); System.out.println("Nome: " + trabalhado[2] + " Salário: "
		 * + f2 .getSalario());
		 */

		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Funcionario("Samuel", "Tech Lead", 19000);
		funcionarios[1] = new Funcionario("Tales", "Dev-ops", 15000);
		funcionarios[2] = new Funcionario("Alex", "Dev-Back-End", 9000);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario + " Salário com abono: " + funcionario.abono(200));
		}
		
		
	}
}
