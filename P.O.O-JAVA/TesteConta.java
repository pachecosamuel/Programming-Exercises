package interfacesPratica;

public class TesteConta {

	public static void main(String[] args) {

		CDB c1 = new CDB();
		Poupanca p1 = new Poupanca();
		ContaCorrente cc = new ContaCorrente();
		
		c1.depositarConta(2000);
		cc.depositarConta(19562.20);
		p1.depositarConta(1500);
		
		c1.setIOF(0.6);
		cc.setTaxa(0.6);
		
		System.out.println("Saldo antes do saque CC: " + cc.getSaldo());
		System.out.println("Saldo antes do saque CDB: " + c1.getSaldo());
		System.out.println("Saldo antes do saque Poupança:" + p1.getSaldo());
		
		cc.sacarConta(830.25);
		c1.sacarConta(150.30);
		p1.sacarConta(300);
		
		System.out.println("Saldo posterior ao saque CC: " + cc.getSaldo());
		System.out.println("Saldo posterior ao saque CDB: " + c1.getSaldo());
		System.out.println("Saldo posterior ao saque Poupança: " + p1.getSaldo());
		
	}

}
