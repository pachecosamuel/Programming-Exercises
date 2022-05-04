package review_16;

public class Autor {

	private String nome, t�tuloLivro;

	public Autor(String nome, String telefone) {
		super();
		this.nome = nome;
		this.t�tuloLivro = telefone;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", t�tulo=" + t�tuloLivro + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return t�tuloLivro;
	}
	
	public void imprime() {
		System.out.println("Nome do autor: " + nome);
	}
	
}
