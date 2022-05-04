package br.org.serratec.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ExemploSoma {

	public static void main(String[] args) {

		/*Calculo c = (a, b) -> a+b;
		System.out.println("O resultado é: " + c.operacao(10000, 9562));*/
		
		List<String> lista = new ArrayList<>();
		lista.add("Iphone 13 Pro");
		lista.add("TV LG 60' ");
		lista.add("Notebook Alienware Shark");
		
		lista.forEach(a -> System.out.println(a));
		System.out.println("--------");
		lista.forEach(System.out::println);
		
		
		
	}

}
