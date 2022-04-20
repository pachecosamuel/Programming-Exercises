package interfacesPratica;

public class CDB implements Conta {

	private double saldo, IOF;
	
	@Override
	public void sacarConta(double valor) {
		if (saldo >= valor) {
			saldo -= (valor + IOF);
		}
	}

	@Override
	public void depositarConta(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setIOF(double iOF) {
		IOF = iOF;
	}

	
	
}
