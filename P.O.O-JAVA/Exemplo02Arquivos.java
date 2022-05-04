package br.org.serratec.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo02Arquivos {

	public static void main(String[] args) {

		//File arquivo = new File("C:\\exemplos\\exercicio.txt");
		
		try {
			Scanner sc = new Scanner(new File("c:\\exemplos\\exercicio.txt"));
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
				System.out.println();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			//e.printStackTrace();
		}
		
	}

}
