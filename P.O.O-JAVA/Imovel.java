package br.org.serratec;

public abstract class Imovel {
	
	private String local;
	private double valor;
	
	public Imovel(String local, double valor) {
		super();
		this.local = local;
		this.valor = valor;
	}
	public String getLocal() {
		return local;
	}
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Imovel [local=" + local + ", valor=" + valor + "]";
	}
	
	public double calcularITBI() {
		return valor * 0.035;
	}
	
}
