package br.org.serratec.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteLeituraGravacao {

	public static void main(String[] args) {
		
		List<Empregado> empregados = new ArrayList<>();
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = sc.next();
			File arquivo = new File(nomeArquivo);
			
			Scanner sc1 = new Scanner(arquivo);
			
			while (sc1.hasNext()) {
				String linha = sc1.nextLine();
				
				if (!linha.isEmpty()) {
					String[] dadosLinha = linha.split(";");
					String nome = dadosLinha[0];
					String profissao = dadosLinha[1];
					empregados.add(new Empregado(nome, profissao));
				} 
				
			}
			sc.close();
			
			//Caminho do arquivo
			FileWriter caminho = new FileWriter("/exemplos/saida.txt");
			//Gravar o arquivo
			PrintWriter gravar = new PrintWriter(caminho);
			for (Empregado empregado : empregados) {
				String linhaArquivo = empregado.getNome() + ";" + empregado.getProfissao() + "\n";
				gravar.printf(linhaArquivo);
			}
			gravar.close();
			
		} catch (Exception e) {
			System.out.println("Erro");
		}
		
		for (Empregado e : empregados) {
			System.out.println(e);
		}
		
		

		
		}
		
	}


