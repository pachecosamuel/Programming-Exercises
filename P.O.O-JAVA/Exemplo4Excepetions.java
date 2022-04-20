package br.org.serratec.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo4Excepetions {
	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("teste.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			e.printStackTrace();
		}

	}
}
