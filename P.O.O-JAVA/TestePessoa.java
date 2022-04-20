package org.serratec.model;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setCodigoPessoa(123);
		p1.setNome("Samuel");
		p1.setAltura(1.81);
		p1.setPeso(88.10);
		
		System.out.println(p1.getNome());
		System.out.println(p1.resultado());

	}

}
