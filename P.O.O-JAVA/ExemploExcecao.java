package br.org.serratec.exceptions;

import java.util.Scanner;

public class ExemploExcecao {

	//throws - passar o erro adiante.
	public static double divisao(int i, int j) throws ArithmeticException{
			return i / j;
			//throw new ArithmeticException("Digite um número diferente de zero! ");
	}
	
	public static void main(String[] args) {

		int a, b;
		
		try {
		
			Scanner x = new Scanner(System.in);
			
			System.out.println("Digite o 1° n°: ");
			a = x.nextInt();
			System.out.println("Digite o 2° n°: ");
			b = x.nextInt();
			
			System.out.println("O resultado é: " + divisao(a, b));
			
		} catch (Exception e) {
			System.out.println("Erro!");
			System.out.println(e.getMessage());
		}
		
				
	}

}
