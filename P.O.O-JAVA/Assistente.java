package br.org.serratec;

public class Assistente extends Funcionario {

	private String categoria;

	public Assistente(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;
	}

	
	
	@Override
	public String toString() {
		return "Assistente [categoria=" + categoria +  super.toString() + "]";
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	@Override
	public void calcularAumentoSalario() {
		Salario = Salario * 1.10 + 100;

	}

}
