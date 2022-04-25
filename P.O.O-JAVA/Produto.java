package review.cap.nove;

public class Produto {

	private int codigo;
	private String descricao;
	private double preco;
	private Categoria categoria;
	
	public Produto(int codigo, String descricao, double preco, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	
	
	
}
