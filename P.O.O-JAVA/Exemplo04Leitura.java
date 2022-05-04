package br.org.serratec.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo04Leitura {
	public static void main(String[] args) {
		
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("/exemplos/exercicio.txt"));
			
			while (br.ready()) {
				System.out.println(br.readLine());
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
}
