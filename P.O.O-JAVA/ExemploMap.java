package br.org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploMap {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(20, 40, 60, 80, 100);
		numeros.stream().map(a -> a*2).forEach(a -> System.out.println(a));
		
		System.out.println("-----Chama na listinha String-------");
		List<String> numeros2 = Arrays.asList("90.2", "19652.20", "30.5", "14.7");
		List<Double> numero3 = numeros2.stream().map(n -> new Double(n)).collect(Collectors.toList());
		numero3.forEach(p -> System.out.println(p));
		
	}

}
