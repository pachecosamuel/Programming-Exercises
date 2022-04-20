package org.serratec.model;

public class Veiculo {
	
	String placa, tipoComb;
	double valor;
	
	public  double calcularIPVA() {
		if (tipoComb.equals("flex") ||  tipoComb.equals("Gasolina")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}
	
}
