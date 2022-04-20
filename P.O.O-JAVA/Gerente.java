package br.org.serratec;

public class Gerente extends Funcionario{

	private String tipoGerente;

	public Gerente(String nome, double salario, String tipoGerente) {
		super(nome, salario);
		this.tipoGerente = tipoGerente;
	}

	public String getTipoGerente() {
		return tipoGerente;
	}

	public void setTipoGerente(String tipoGerente) {
		this.tipoGerente = tipoGerente;
	}
	
	@Override
	public String toString() {
		return "Gerente [tipoGerente=" + tipoGerente +  super.toString() + "]";
	}

	@Override
	public void calcularAumentoSalario() {
		Salario *= 1.13;
	}
	
	
}
