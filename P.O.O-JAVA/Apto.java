package br.org.serratec;

public class Apto extends Imovel{

	private int andar, numero;

	public Apto(String local, double valor, int andar, int numero) {
		super(local, valor);
		this.andar = andar;
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Andar: " + andar + " Número: " + numero;
	}

	
	
	
	
}
