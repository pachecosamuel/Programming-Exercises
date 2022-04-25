package review.cap.nove;

import java.time.LocalDate;

public class Venda implements FinalizarVenda{

	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private static double totalVenda = 0;
	
	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}
	
	

	@Override
	public void calcularVenda() {
		 this.totalVenda += quantidade * produto.getPreco();
	}



	@Override
	public boolean verificarQuantidade() {
		if (quantidade == 0) {
			throw new VendaExcecao("Produto esgotado");
		}
		return true;
	}



	@Override
	public boolean verificarValor() {
		if (produto.getPreco() <= 0) {
			throw new VendaExcecao("Valor inválido");
		}
		return true;
	}



	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public static double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", dataCompra=" + dataCompra + ", quantidade=" + quantidade + "]";
	}
	
	
	
}
