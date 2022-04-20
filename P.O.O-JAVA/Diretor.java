package br.org.serratec;

public class Diretor extends Funcionario{

	private String tipo;

	public Diretor(String nome, double salario, String tipo) {
		super(nome, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

	@Override
	public String toString() {
		return "Diretor [tipo=" + tipo + super.toString() + "]";
	}

	@Override
	public void calcularAumentoSalario() {
		Salario *= 1.15;
	}
	
	
	
}
