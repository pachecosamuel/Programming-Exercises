package br.org.serratec;

public abstract class Funcionario {

	protected String nome;
	protected double Salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		Salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public double getSalario() {
		return Salario;
	}

	

	@Override
	public String toString() {
		return "[nome=" + nome + ", Salario=" + Salario + "]";
	}

	//Ñ tem implementação, qm implementará serão os filhos.
	public abstract void calcularAumentoSalario();
	
}
