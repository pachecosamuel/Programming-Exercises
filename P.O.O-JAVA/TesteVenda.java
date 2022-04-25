package review.cap.nove;

import java.time.LocalDate;

public class TesteVenda {
	public static void main(String[] args) {
		
		Produto p1 = new Produto(112, "Iphone 13", 8000., Categoria.ELETRONICO);
		Produto p2 = new Produto(115, "AirPods 2", 500., Categoria.ELETRONICO);
		Produto p3 = new Produto(114, "Whey Protein", 119.90, Categoria.ALIMENTO);
		
		Venda v1 = new Venda(p1, LocalDate.now(), 0);
		Venda v2 = new Venda(p2, LocalDate.now(), 2);
		Venda v3 = new Venda(p3, LocalDate.now(), 4);
		
		System.out.println("Produto: " + v1.getProduto().getDescricao());
		System.out.println("Produto: " + v2.getProduto().getDescricao());
		System.out.println("Produto: " + v3.getProduto().getDescricao());
		
		
		v1.calcularVenda();
		v2.calcularVenda();
		v3.calcularVenda();
		
		System.out.println("Valor total da venda: " + v1.getTotalVenda());
		
		try {
			v1.verificarQuantidade();
		} catch (VendaExcecao v) {
			System.out.println( p1.getDescricao()+ " " + v.getMessage());
		}
		
		try {
			v2.verificarValor();
		} catch (VendaExcecao v) {
			System.out.println(v.getMessage());
		}
		
	}
}
