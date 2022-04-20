package org.serratec.model;

public class TesteMedico {

	public static void main(String[] args) {
		
		Medico p1 = new Medico("Samuel", "0174", 40000.00, 200.00);
		Medico p2 = new Medico("Andr�", "0432", 45050.00, 230.90);

		p1.pagamentoDinheiro(200);
		p2.pagamentoPlano(230.90);
		
		
		System.out.println("M�dico: " + p1.getNome() + " CRM: " + p1.getCrm() + "\n");
		System.out.println("M�dico: " + p2.getNome() + " CRM: " + p2.getCrm() + "\n");

		
		System.out.println("O n� total de m�dicos �: " + Medico.getTotalMedicos());
		
	}

}
