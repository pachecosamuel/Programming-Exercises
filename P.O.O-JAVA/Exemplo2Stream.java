package br.org.serratec.interfaces;

import java.util.Arrays;
import java.util.List;

public class Exemplo2Stream {

	public static void main(String[] args) {

		List<Double> numeros = Arrays.asList(10.5, 50.3, 30.9, 22.22, 14.7, 10.5);
		//numeros.stream().distinct().forEach(a -> System.out.println(a));
		
		numeros.stream().distinct().sorted().forEach(a -> System.out.println(a));
		
	}

}
