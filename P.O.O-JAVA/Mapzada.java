package reviewCap10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Mapzada {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> cursos = new LinkedHashMap<>();
		cursos.put(1, "P.O.O");
		cursos.put(2, "Direito Cibernético.");
		cursos.put(3, "Gestão por Scrum");
		cursos.put(4, "Artes");
		
		for (Map.Entry<Integer, String> obj : cursos.entrySet()) {
			System.out.println(obj);
		}
		
		
		
		/*TreeMap<Integer, String> mapaNomes = new TreeMap<>();
		
		mapaNomes.put(1, "João Gomes");
		mapaNomes.put(2, "Gabi");
		mapaNomes.put(3, "Lázaro");
		mapaNomes.put(4, "Arrasca");
		
		System.out.println(mapaNomes.descendingKeySet());
		
		//Collections.sort(mapaNomes);
		
		System.out.println(mapaNomes.entrySet());
		
		---------------------------------------------------
		
		HashMap<Integer , String> mapaEstados = new HashMap<>();
		mapaEstados.put(1, "RJ");
		mapaEstados.put(2, "RS");
		mapaEstados.put(3, "SP");
		mapaEstados.put(4, "PR");
		
		System.out.println(mapaEstados.keySet());
		System.out.println(mapaEstados.values());
		System.out.println(mapaEstados.entrySet());*/
		
	}

}
