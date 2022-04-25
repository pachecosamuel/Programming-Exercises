package br.org.serratec;

import java.util.Arrays;
import java.util.List;

public class Exemplo_Diferencas_Arrays_Listof {

	public static void main(String[] args) {

	/*String[] carros = {"Bmw x1" , "Eclipse", "Kicks"};
	
	//Permite a inserção de um vetor dentro dele
	//Na real ele acessará e mostrará os elementos.
	List listaCarros = Arrays.asList(carros);
	
	listaCarros.set(1, "Lamborghini");
	carros[2] = "Hórus";
	
	for (Object object : listaCarros) {
		System.out.println(object);
	}*/

	String[] cores = {"Vermelho", "Azul", "Amarelo"};
	List lista = List.of(cores);
	cores[0] = "Preto";
	System.out.println(lista);
	
	
	}

}
