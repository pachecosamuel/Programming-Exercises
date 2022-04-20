package br.org.serratec;

public class TesteTime {

	public static void main(String[] args) {

		Atleta a1 = new Atleta("CR7", "ATA", 37);
		Atleta a2 = new Atleta("Neymar", "PD", 30);
		Atleta a3 = new Atleta("Gabigol", "ATA", 31);
		
		Time t1 = new Time("Flamengo", "Samuel", new Atleta[3]);
		
		t1.inserirAtletas(a1);
		t1.inserirAtletas(a2);
		t1.inserirAtletas(a3);
		
		System.out.println("Time: " + t1.getNomeTime());
		t1.listarTime();

	}

}
