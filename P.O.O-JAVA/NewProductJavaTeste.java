package org.serratec.model;

import java.util.Locale;
import java.util.Scanner;

public class NewProductJavaTeste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		char op = 's';
		Scanner x = new Scanner(System.in);
		NewProduct p1 = new NewProduct();

		do {
			System.out.println("Descrição do produto:");
			p1.setDescricao(x.next());

			System.out.println("Preço:");
			p1.setValor(x.nextDouble());

			System.out.println("Quantidade:");
			p1.setQtd(x.nextInt());

			System.out.println("Descrição: " + p1.getDescricao() + "\n" + "Valor: " + p1.getValor() + "\nTotal: "
					+ (p1.getValor() * p1.getQtd()) + "\nICMS: " + p1.calcularICMS(p1.getValor() * p1.getQtd()) + "\n");

			System.out.println("Deseja continuar o programa? (S/N)");
			op = x.next().charAt(0);

		} while (op == 's' || op == 'S');

		System.out.println("Programa finalizado");
		x.close();

	}

}
