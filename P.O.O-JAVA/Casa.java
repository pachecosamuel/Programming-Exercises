package br.org.serratec;

public class Casa extends Imovel {

	private boolean garagem;

	public Casa(String local, double valor, boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	public boolean isGaragem() {
		return garagem;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + 
				(garagem? "Casa tem garagem.":"Não tem garagem.");
	}
	
	
	
	
	
}
