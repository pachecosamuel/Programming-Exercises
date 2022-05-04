package br.org.serratec.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo06GravacionesBufferezada {

	public static void main(String[] args) {

		BufferedWriter bw;
		
		try {
		 bw = new BufferedWriter(new FileWriter("/exemplos/exercicio.txt"));
		 bw.append("Serrateczada");
		 bw.append("\n");
		 bw.append("Olá mundão");
		 bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
