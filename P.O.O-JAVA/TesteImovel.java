package br.org.serratec;

public class TesteImovel {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("123", "Samuel", "abc@gmail.com");
		Pessoa p2 = new Pessoa("456", "André", "xyz@gmail.com");
		Imovel m1 = new Imovel("Casa", 250000, p1);
		//Imovel m2 = new Imovel("Apto", 190000, new Pessoa("456", "Jao", "xyz@gmail.com"));

		System.out.println("Imovel: " + m1.getTipo() +
				"\nValor: " + m1.getValor() + "\nDono: " +
				m1.getDono().getNome());
		
	}

}
