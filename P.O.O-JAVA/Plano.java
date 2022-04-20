package br.org.serratec;

public class Plano {

	protected String nome;
	protected double valorPago = 80.0, valorIss = 5.0;
	
	public Plano(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public double getValorPago() {
		return valorPago;
	}

	public double getValorIss() {
		return valorIss;
	}

	@Override
	public String toString() {
		return "Plano [nome=" + nome + ", valorPago=" 
	+ String.format("%2f", valorPago) + "]";
	}

	public double calcularPagamento() {
		return valorPago = valorPago -( valorPago * valorIss / 100);	
	}
	
	
}
