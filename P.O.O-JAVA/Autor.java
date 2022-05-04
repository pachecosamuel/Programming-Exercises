package review_16;

public class Autor {

	private String nome, títuloLivro;

	public Autor(String nome, String telefone) {
		super();
		this.nome = nome;
		this.títuloLivro = telefone;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", título=" + títuloLivro + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return títuloLivro;
	}
	
	public void imprime() {
		System.out.println("Nome do autor: " + nome);
	}
	
}
