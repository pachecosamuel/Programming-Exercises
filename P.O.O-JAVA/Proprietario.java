package br.org.serratec;

public class Proprietario {

	private String nome;
	private Imovel imovel;
	
	public Proprietario(String nome, Imovel imovel) {
		super();
		this.nome = nome;
		this.imovel = imovel;
	}

	public String getNome() {
		return nome;
	}

	public Imovel getImovel() {
		return imovel;
	}

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + "]" + " Imóvel: " + imovel ;
	}

	
	
	
}
