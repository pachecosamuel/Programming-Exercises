package br.org.serratec.exceptions;

public class TesteConta {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente("123", "Samuel", 19000);
		
		try {
			cc.deposito(1500);
			cc.saque(23000);
		} catch (ContaExcepetion e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
