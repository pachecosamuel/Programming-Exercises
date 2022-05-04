package br.org.serratec.exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.org.serratec.model.Fornecedor;

public class ExemploSerializacao implements Serializable {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("340", "Lacoste", "lala@gmail.com",28.50);
		Fornecedor f2 = new Fornecedor("777", "Gucci", "gucci@gmail.com",35.90);
		Fornecedor f3 = new Fornecedor("340", "Nike", "nike@gmail.com", 22.32);
		
		//Interessante estudar um pouco sobre Equals e HashCode.
		if (f1.equals(f3)) {
			System.out.println("Mesmo cnpj");
		} else {
			System.out.println("Diferentes");
		}
		
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(f1);
		fornecedores.add(f2);
		fornecedores.add(f3);
		
		
		
		try {
			FileOutputStream arquivoGravar = new FileOutputStream("c://exemplos//Fornecedor.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(fornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.close();
			System.out.println("Arquivo gravado.");
		} catch (Exception e) {
			System.out.println("Não foi possível gravar o objeto!");
			e.printStackTrace();
		}
		
		System.out.println("leitura do objeto criado com sucesso!");
		
		try {
			FileInputStream caminhoArquivo = new FileInputStream("c://exemplos//Fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(caminhoArquivo);
			System.out.println(lerObjeto.readObject());
			lerObjeto.close();
			caminhoArquivo.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro ao ler arquivo!");
		}
}
}