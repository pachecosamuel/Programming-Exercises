package br.org.serratec;

public  class Policial {
	
	protected String cpf, nome;
	protected  double salario;
	protected final String lotacao;
	protected static int totalPoliciais;
	
	
	public Policial(String cpf, String nome, double salario, String lotacao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.lotacao = lotacao;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static int getTotalPoliciais() {
		return totalPoliciais;
	}

	public String getLotacao() {
		return lotacao;
	}

	
	
	//Não pode ser sobrescrito, pois é declarado como final
	public final String mostrarInformacoes() {
		return nome + "-" + cpf +  "-"  + salario;
	}
	
}
