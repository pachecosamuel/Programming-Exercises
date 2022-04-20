package org.serratec.model;

public class Conta {
	String titular, cpf;
	double saldo;
	
	// M�todo sem retorno
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Seu saldo atual" + " � de R$:" + saldo);
	}

	// M�todo com retorno
	public boolean saque(double valor) {
		if (saldo <= valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}
	
}
