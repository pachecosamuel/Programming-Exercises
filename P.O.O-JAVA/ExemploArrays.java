package br.org.serratec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArrays {

	public static void main(String[] args) {

		List lista = Arrays.asList("TV 55", "Iphone 13", "Kindlezada");
		//lista.add("Webcam");
		
		if(lista.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			lista.set(2, "Headset Razer Kraken Pró");
			System.out.println(lista.get(2));
			System.out.println("O elemente da posição 2 é Headset?" + 
			(lista.contains("Headset") ? " Sim" : " Não"));
		}
		
		Collections.sort(lista);
		System.out.println(lista);

	}

}
