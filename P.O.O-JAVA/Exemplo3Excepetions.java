package br.org.serratec.exceptions;

public class Exemplo3Excepetions {

	public static void main(String[] args) {
		
	int vetor[] = {10, 30, 60};
	int a = 30, b = 0, c = 0;
	String nome = null;
	
	try {
		System.out.println(nome.equals("Fulano"));
		System.out.println("Vetor posi��o 3: " + vetor[3]);
	} catch (ArithmeticException |
			ArrayIndexOutOfBoundsException e) {
		System.out.println("Erro divis�o por zero ou �ndice fora de faixa");
		//System.out.println(e.getMessage());
	}  catch (NullPointerException e) {
		System.out.println("Faltou inst�ncia.");
		e.printStackTrace();
	}
	
	
	}
}
