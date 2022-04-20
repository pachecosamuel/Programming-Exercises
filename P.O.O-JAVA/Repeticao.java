package org.serratec;

public class Repeticao {

	public static void main(String[] args) {
		
		int cont = 1;
		
		while (cont <= 10) {
			System.out.println("Valor atual de i = " + cont);
			cont++;
		}
		
		cont = 0;
		
		do {
			System.out.println("Valor atual de i = " + cont*2);
			cont++;
		} while (cont <= 10);
		
		cont = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Valor atual de i = " + i);
		}

	}

}
