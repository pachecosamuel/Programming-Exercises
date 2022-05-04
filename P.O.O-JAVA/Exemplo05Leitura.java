package br.org.serratec.arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Exemplo05Leitura {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("c:\\exemplos\\exercicio.txt"), "UTF-8"));
			while (sc.hasNext()) {
				System.out.println(sc.nextLine() + "\n");
			}
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
