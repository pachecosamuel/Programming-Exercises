package br.com.senai.model;

public class TesteMedico {

	public static void main(String[] args) {

		Anestesista m1 = new Anestesista("123", "Samuel", 220.0 , 1000);
		Medico m2 = new Medico("456", "André", 250.00);
		
		System.out.println(m1);
		System.out.println();
		System.out.println(m2);
		
	}

}
