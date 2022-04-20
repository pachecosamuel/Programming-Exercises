package org.serratec.model;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		char s = 's';
		Scanner x = new Scanner(System.in);
		Veiculo v1 = new Veiculo();
		
		do {
	
		System.out.println("Digite a placa: ");
		v1.placa = x.next();
		System.out.println("Digite o tipo de combustível: ");
		v1.tipoComb = x.next();
		System.out.println("Digite o valor do veículo: ");
		v1.valor = x.nextDouble();
		
		System.out.println("O valor do ipva 2022 é: " + v1.calcularIPVA());
		
		System.out.println("Você deseja calcular novo IPVA? (s/n)");
		s = x.next().charAt(0);
		} while (s == 'S' || s == 's');
		
		x.close();
	}

}
