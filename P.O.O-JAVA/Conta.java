package review_16;

@FunctionalInterface
public interface Conta {

	public void transacao();
	
	default void investimento() {
		System.out.println("Investimento efetuado! (M�todoz�o Default pai)");
	}
	
}
