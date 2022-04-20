package br.org.serratec;

public class TesteImovel {

	public static void main(String[] args) {

		Imovel imv1 = new Casa("Ipanema", 850000.00, true);
		Imovel imv2 = new Apto("Leblon", 990000.00, 4, 1271);

		Proprietario p1 = new Proprietario("Samuel", imv1);
		//Proprietario p1 = new Proprietario("Samuel", imv1);
		
		System.out.println(p1);
	}

}
