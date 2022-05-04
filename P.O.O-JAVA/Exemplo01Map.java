package br.org.serratec.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo01Map {

	public static void main(String[] args) {

		HashMap<String, String> mapaEstados = new HashMap<>();
		mapaEstados.put("RJ", "Rio de Janeiro");
		mapaEstados.put("SP", "São Paulo");
		mapaEstados.put("ES", "Espírito Santo");
		mapaEstados.put("RS", "Rio Grande do Sul");
		mapaEstados.put("MG", "Minas Gerais");
		mapaEstados.put("SC", "Santa Catarina");
		mapaEstados.put("SC", "Santa Catarina");
		
		/*for (String sigla : mapaEstados.keySet()) {
			System.out.println(sigla);
		}
		
		for (String nome: mapaEstados.values()) {
			System.out.println(nome);
		}
		
		for (Map.Entry<String, String> dados : mapaEstados.entrySet()) {
			//System.out.println(dados);
			System.out.println(dados.getKey() + " --- " + dados.getValue());
		}*/
		
		TreeMap<String, String> mapasOrdenados = new TreeMap<>(mapaEstados);
		/*System.out.println(mapasOrdenados);
		System.out.println(mapasOrdenados.descendingMap());*/
		
		
		
		
	}

}
