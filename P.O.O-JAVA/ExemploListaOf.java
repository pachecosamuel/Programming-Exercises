package br.org.serratec;

import java.util.List;

public class ExemploListaOf {

	public static void main(String[] args) {

		List lista = List.of("Iphone 13 pro" , "Airpods2" , "Ipad ");
		List lista2 = List.of("Iphone 13 pro" , "Airpods2" , "Ipad ");
		List lista3 = List.of(123);
		
		System.out.println(lista3);
		
		/* Restrições, desse tipo de lista imutável:
		 * 
		 * List.add("Som");	N podemos add
		 * Lista.remove(0);	Nem remover
		 * Lista.set(0, "Som");	Nem alterar
		 * Como se fosse uma lista p/ mostrar estados, cdd, etc.
		 */
		System.out.println(lista);
		
	}

}
