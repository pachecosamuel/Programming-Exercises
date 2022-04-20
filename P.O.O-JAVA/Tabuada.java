package org.serratec.model;

import java.util.Scanner;

public class Tabuada {

		public static void main(String[] args) {
			Scanner x = new Scanner(System.in);
			
			System.out.println("Digite o número da tabuada que deseja exibir: ");
			int num = x.nextInt();
			
			System.out.println();
			
			for (int i = 0; i <= 10; i++) {
				System.out.printf("| %d x %d =  %d |%n", num, i, (i * num));
			}
			
			x.close();
		}

}
