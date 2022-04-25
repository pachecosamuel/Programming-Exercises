package review.cap.nove;

public class Ex02_Cliente {

	private String nome, telefone, id;
	private int idade;
	
	/*public Ex02_Cliente(String nome, String telefone, String id, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.id = id;
		this.idade = idade;
	}*/

	public Ex02_Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getId() {
		return id;
	}

	public int getIdade() {
		return idade;
	}
	
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Ex02_Cliente [nome=" + nome + ", telefone=" + telefone + ", id=" + id + ", idade=" + idade + "]";
	}
	
	
	
}
