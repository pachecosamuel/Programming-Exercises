package br.org.serratec.compare;

public class Pessoa implements Comparable<Pessoa>{

	private String nome, cpf;
	private int idade;
	
	public Pessoa(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	/*@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return nome.compareTo(o.getNome());
	}*/
	
	public int compareTo(Pessoa outraPessoa) {
	/*	if(idade > outraPessoa.getIdade()) {
			return -1;
		}else if (idade < outraPessoa.getIdade()) {
			return 1;
		} else {
			return 0;
		}*/
		return idade - outraPessoa.getIdade();
	}
	
	
	
}
