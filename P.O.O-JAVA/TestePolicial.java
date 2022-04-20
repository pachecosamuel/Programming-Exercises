package br.org.serratec;

public class TestePolicial {

	public static void main(String[] args) {

		PolicialFederal pf1 = new PolicialFederal("123", "Samuel", 20000, 
				"RJ", "222");

		PolicialFederal pf2 = new PolicialFederal("456", "João", 15000, 
				"RJ", "444");
		
		System.out.println("Total de canas: " + PolicialFederal.getTotalPoliciais());
		
	}

}
