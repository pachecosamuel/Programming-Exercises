package br.org.serratec;

public class TesteNewAtleta {

	public static void main(String[] args) {

		NewAtleta a1 = new NewAtleta("Arrasca", "MEI", 28);
		NewAtleta a2 = new NewAtleta("BH", "ATA", 30);
		NewAtleta a3 = new NewAtleta("Gabi", "ATA", 24);
		
		NewTeam t1 = new NewTeam("Flamengo", "Romântico", new NewAtleta[3]);
		
		t1.adicionarAtletas(a1);
		t1.adicionarAtletas(a2);
		t1.adicionarAtletas(a3);
		
		System.out.println("Time: " + t1.getNomeTime());
		t1.mostrarTime();
		
	}

}
