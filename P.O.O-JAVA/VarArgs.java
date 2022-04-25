package review.cap.nove;

public class VarArgs {

	public static void main(String[] args) {

		int total = calcularSoma(10, 20, 30);
		System.out.println(total);

	}

	public static int calcularSoma(int numero, int... numeros) {
		int soma = 0;
		
		for (int valor : numeros) {
			soma = soma + valor;
		}
		return soma;
	}
	
}
