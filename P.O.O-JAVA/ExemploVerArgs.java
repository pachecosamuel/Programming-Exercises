package br.org.serratec;

public class ExemploVerArgs {

	public static void main(String[] args) {

		int total = calculaSoma(2, 10,10);
		System.out.println("total: " + total);	
		}

	private static int calculaSoma(int numero, int... numeros) {
		int soma = 0;
		
		for (int valor : numeros) {
			soma += valor;
		}
		return soma * numero;
	}

}