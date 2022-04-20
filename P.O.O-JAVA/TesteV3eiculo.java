package br.com.senai.model;

public class TesteV3eiculo {

	public static void main(String[] args) {
		
		Caminhao c1 = new Caminhao();
		c1.setPlaca("123");
		c1.setChassi("343434");
		c1.setCor("Azul");
		c1.setCargaMaxima(1000);
		
		c1.setValorIPVA(5000);
		c1.adicionarValorIPVA(500);

		System.out.println(c1.toString());

	}

}
