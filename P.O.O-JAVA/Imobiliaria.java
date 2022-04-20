package org.serratec.model;

public class Imobiliaria {

		String tipoImovel, local;
		double valorImovel;
		
		public void reajustarImovel() {
			
				if (tipoImovel.equals("Apto")) {
						valorImovel *= 1.10;
				} else {
						valorImovel *= 1.05;
				}
		}
		
		public static void main(String[] args) {
			
			Imobiliaria i1 = new Imobiliaria();
			i1.local = "Copacabana";
			i1.tipoImovel = "Apto";
			i1.valorImovel = 1000000.00;
			
			i1.reajustarImovel();
			System.out.println("Valor reajustado é: " + i1.valorImovel);
			
		}
		
		
		
		
		
		
		
	
}
