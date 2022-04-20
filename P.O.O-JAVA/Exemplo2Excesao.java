package br.org.serratec.exceptions;

public class Exemplo2Excesao {

	public static void main(String[] args) {

		String fraseInicial = null;
		String fraseFinal = null;
		
		try {
			fraseFinal = fraseInicial.toUpperCase();
		} catch (Exception e) {
			System.out.println("Falha ao converter! ");
			e.printStackTrace();
		}

	}

}
