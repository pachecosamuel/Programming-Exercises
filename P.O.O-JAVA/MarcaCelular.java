package br.org.serratec.enumaradores;

public class MarcaCelular {

	private int tamanho;
	private String modelo;
	private Marca marcaCelular;
	
	public MarcaCelular(int tamanho, String modelo, Marca marcaCelular) {
		super();
		this.tamanho = tamanho;
		this.modelo = modelo;
		this.marcaCelular = marcaCelular;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getModelo() {
		return modelo;
	}

	public Marca getMarcaCelular() {
		return marcaCelular;
	}

	@Override
	public String toString() {
		return "MarcaCelular [tamanho=" + tamanho + ", modelo=" + modelo + ", marcaCelular=" + marcaCelular + "]";
	}
	
	
	
}
