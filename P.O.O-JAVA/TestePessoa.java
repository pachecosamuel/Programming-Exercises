package br.org.serratec;

import java.util.ArrayList;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Samuel", "samuel@g", 23);
		Pessoa p2 = new Pessoa("Ana", "ana@g", 43);
		Pessoa p3 = new Pessoa("Julio", "julio@g", 29);
		Cliente c1 = new Cliente("Danubia");
		
		List<Pessoa> pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		//pessoas.add(c1);
		
		//pessoas.addAll(pessoas);
		
		for (Object pessoa : pessoas) {
			System.out.println(pessoa);
		}

	}

}
