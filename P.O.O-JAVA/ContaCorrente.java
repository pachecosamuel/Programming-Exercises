package br.org.serratec.exceptions;

public class ContaCorrente implements Conta {

	private String numeroConta, titular;
	public double saldo;
	
	public ContaCorrente(String numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [numeroConta=" + numeroConta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	
	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean saque(double valor) {
		if(saldo < valor) {
			throw new ContaExcepetion("Saldo insuficiente! ");
		}
		return true;
	}

	@Override
	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}

}
