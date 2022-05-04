package review_16;

public class TesteConta {

	public static void main(String[] args) {

		Conta c1 = () -> System.out.println("Transação efetuada com sucesso!");
		
		c1.transacao();
		
		c1.investimento();
		
		/*Conta c2 = null;
		c2.transacao();*/
		
	}
}
