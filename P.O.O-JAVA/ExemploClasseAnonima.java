package review_16;

public class ExemploClasseAnonima {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Objeto instanciado a classe Thread!");
			}
		}).run();;
		
	}

}
