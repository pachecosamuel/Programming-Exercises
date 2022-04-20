package org.serratec.model;

import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter with the new value: ");
		a = x.nextInt();
		System.out.println("Enter with the new value: ");
		b = x.nextInt();
		
		System.out.println("O resultado da soma é: " + a*b);
		
	}
}
