package br.org.serratec;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {
	public static void main(String[] args) {
		
		List lista = new ArrayList<>();
		lista.add("Airpods 2");
		lista.add("Iphone 13 pró");
		lista.add("Kindlezada");
		
		/*System.out.println(lista);
		System.out.println(lista.size());*/
		System.out.println(lista.remove(0));
		System.out.println(lista.get(2));
		lista.set(0, "Airpods 3");
		
		/*for (Object object : lista) {
			System.out.println(lista);
		}*/
		
	}
}
