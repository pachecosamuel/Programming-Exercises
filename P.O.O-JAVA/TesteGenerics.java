package reviewCap10;

public class TesteGenerics {

	public static void main(String[] args) {

		/*Generics<Double> g1 = new Generics<>(19562.20);
		Generics<String> g2 = new Generics("Samuel");
		System.out.println(g1.getX());
		System.out.println(g2.getX());*/
		
		Generics<? super Number> g3 = new Generics<>(10);
		System.out.println(g3.getX());
		
		g3.setX(19562.20);
		System.out.println("Seu salário é: " + g3.getX());
		
		g3.setX(5);
		System.out.println("Você está há " + g3.getX() + " anos na empresa");
		
		
	}

}
