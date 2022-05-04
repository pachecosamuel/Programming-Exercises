package br.org.serratec.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHash {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> cursos =  new LinkedHashMap<>();
		cursos.put(1, "php");
		cursos.put(2, "Api restful");
		cursos.put(3, "Redes");
		cursos.put(4, "Python");
		
		for (Map.Entry<Integer, String> s : cursos.entrySet()) {
			System.out.println(s);
		}
		
	}

}
