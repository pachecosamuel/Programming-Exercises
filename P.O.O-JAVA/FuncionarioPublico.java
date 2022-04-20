package br.org.serratec;

public class FuncionarioPublico {

	protected String nome, cargo;
	protected final int ANO_CONCURSO;

	public FuncionarioPublico(String nome, String cargo, int aNO_CONCURSO) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		ANO_CONCURSO = aNO_CONCURSO;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public int getANO_CONCURSO() {
		return ANO_CONCURSO;
	}

	@Override
	public String toString() {
		return "FuncionarioPublico [nome=" + nome + ", cargo=" 
				+ cargo + ", ANO_CONCURSO=" + ANO_CONCURSO + "]";
	}

}
