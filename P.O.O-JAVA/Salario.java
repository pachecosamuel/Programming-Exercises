package org.serratec;

public class Salario {

	public static void main(String[] args) {
		String nome = "Samuel Pacheco";
		double salario = 19523.05;
		
		if (salario > 5839.45) {
			System.out.println("Salário descontado: " + salario*0.89 );
		} else if (salario >= 2919.73){
			System.out.println("Salário descontado: " + salario*0.9);
		} else if (salario >= 1751.82) {
			System.out.println("Salário descontado: " + salario*0.91);
		} else {
			System.out.println("Salário descontado: " + salario*0.92);
		}

	}

}
