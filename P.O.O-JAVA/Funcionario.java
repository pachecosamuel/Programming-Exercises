package br.org.serratec;

public class Funcionario {

	private String nome, cargo, dpto;

	public Funcionario(String nome, String cargo, String dpto) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.dpto = dpto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", dpto=" + dpto + "]";
	}
	
	
	
	
}
