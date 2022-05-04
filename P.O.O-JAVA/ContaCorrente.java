package br.org.serratec.model;

import br.org.serratec.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		// TODO Auto-generated method stub

	}

	@Override
	public void investimento() {
		System.out.println("Investimento na B3 efetuado com sucesso;");
	}

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		conta.investimento();
		
	}
	

}
