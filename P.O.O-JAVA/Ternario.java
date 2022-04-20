package org.serratec;

public class Ternario {

	public static void main(String[] args) {
		boolean a = (1 > 5);
		boolean b = !(1 < 2);
		
		System.out.println(a);

		int dia = 30;
		if (dia < 30) {
			System.out.println("Fevereiro");
		} else {
			System.out.println("Outro mês");
		}
		
		//System.out.println(dia < 30 ? "Fevereiro" : "Another month");
		

	}

}
