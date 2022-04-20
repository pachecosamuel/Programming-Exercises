package org.serratec.model;

public class TestarConta {
	
	public static void main(String[] args) {

			Conta c1 = new Conta();
			c1.cpf = "013";
			c1.titular = "Samuel Pacheco";
			c1.saldo = 19000.00;

			c1.depositar(19000.00);	
	
			Conta c2 = new Conta ();
			c2.cpf = "014";
			c2.saldo = -495.10;
			c2.titular = "Ela";
			
			if (c1.saque(5000)) {
				System.out.println("Saque efetuado paizão. \n");
				System.out.println("Seu saldo atual é: " + c1.saldo);
			} else {
				System.out.println("Saldo insuficiente");
			}
		
			Conta c3 = new Conta();
			
			c3.cpf = "10002337746";
			c3.saldo = 19000.00;
			c3.titular = "Samuel Caetano Pacheco";
			
			c3.depositar(5322.50);
			
			if (c3.saque(4800.00)) {
				System.out.println("Compra de iphone aprovada.");
			} else {
				System.out.println("Se esforce um pouco mais");
			}
			
			c3.depositar(5322.50);
			
	
			
		
			
			
			
	}

}
