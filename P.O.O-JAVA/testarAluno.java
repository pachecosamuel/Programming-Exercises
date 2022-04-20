package org.serratec.model;

public class testarAluno {

	public static void main(String[] args) {

		// Criação de um instância de um objeto
		Aluno a = new Aluno();
		
		
		a.codAluno = 4502;
		a.email = "pacheco.samuel@hotmail.com";
		a.nome = "Samuel Pacheco";
		a.telefone = "(24) 99215-6965";

		System.out.println(a.codAluno);
		System.out.println(a.email);
		System.out.println(a.nome);
		System.out.println(a.telefone);
		 
		Aluno samuel = new Aluno();
		System.out.println(a);
		System.out.println(samuel);
	}

}
