package br.org.serratec.exemplos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.org.serratec.model.Produto;

public class TesteProduto {

	public static void main(String[] args) {

		Produto p1 = new Produto(1, "Vinho Rosè", 50, LocalDate.of(2022, 4, 1));
		Produto p2 = new Produto(2, "Jack Daniels Honey", 55, LocalDate.of(2022, 4, 1));
		Produto p3 = new Produto(3, "Veuve Clicquot", 52, LocalDate.of(2022, 4, 1));
		Produto p4 = new Produto(4, "Ciroc red berry", 40, LocalDate.of(2022, 4, 1));
		
		List<Produto> listaProdutos =  Arrays.asList(p1,p2,p3,p4);
		
		/* FORMA TRADICIONAL.
		Collections.sort(listaProdutos);
		System.out.println(listaProdutos);
		*/
		
		Comparator<Produto> compareQtd = (a, b) -> a.getQuantidadeEstoque().compareTo(b.getQuantidadeEstoque());
		Collections.sort(listaProdutos, compareQtd);
		//listaProdutos.forEach(p -> System.out.println(p));
		//listaProdutos.stream().sorted().forEach(p -> System.out.println(p));
		
		listaProdutos.sort((a, b) -> a.getQuantidadeEstoque().compareTo(b.getQuantidadeEstoque()));
		listaProdutos.forEach(p -> System.out.println(p));
		
		System.out.println("--------Filtro por nome-------");
		listaProdutos.stream().distinct().filter(p -> p.getNome().contains("Vinho")).forEach(p -> System.out.println(p));
		
	}

}
