package org.serratec.model;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor ("Nike", "24992156968", "055");
		Fornecedor f2 = new Fornecedor ("Adidas", "2499998888", "056");
		Fornecedor f3  = new Fornecedor ("Dior", "2477776666", "057");
		
		System.out.println(f1.getNomeSocial());
		System.out.println(f2.getNomeSocial());
		System.out.println(f3.getNomeSocial());

		
		System.out.println("O número de fornecedores é: " + Fornecedor.getContador());

	}

}
