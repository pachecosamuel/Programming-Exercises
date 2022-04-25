package br.org.serratec;

public class ExemploVetor {

	public static void main(String[] args) {

		//String[] vetor = {"Iphone" , "TV" , "Blu-Ray"};
		//vetor[2] = "Home teather";
		
		String[][] funcionario = {{"Samuel" , "Danubia"},
				{"Joao" , "Péricles"} , {"Carla" , "Carla@boll"}};

		/*for (int linha = 0; linha < funcionario.length; linha++) {
			for (int coluna = 0; coluna < funcionario[linha].length;
					coluna++);
			System.out.println(funcionario[linha][coluna]);
		}*/
		
		for (int linha = 0; linha < funcionario.length; linha++) {
			for (int coluna = 0; coluna < funcionario[linha].length; coluna++) {
				System.out.printf(funcionario[linha][coluna] + "  ");
			}	
				System.out.println("\n");
	}
		

		
	}
}
