package br.org.serratec;

public class ContaCorrente implements Conta {

	private double saldo, taxa;
	
	@Override
	public void saque(double valor) {
		if (saldo >= valor) {
			saldo -= valor - taxa;
		}
	}

	@Override
	public void deposito(double valor) {
		saldo += valor;
	}

}
