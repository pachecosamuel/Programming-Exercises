package br.org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.org.serratec.model.Aluno;

public class Exemplo1 {

	public static void main(String[] args) {

		Aluno a1 = new Aluno(1, "Samu", "samu@g.com", 24);
		Aluno a2 = new Aluno(2, "Danubia", "dan@g.com", 26);
		Aluno a3 = new Aluno(3, "Anitta", "ant@g.com", 30);
		Aluno a4 = new Aluno(4, "PA", "pa@g.com", 27);
		Aluno a5 = new Aluno(5, "Scooby", "scooby@g.com", 28);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		/*
		 * alunos.forEach( a -> System.out.println(a) ); ExibirAlunos ed = new
		 * ExibirAlunos(); alunos.forEach(ed);
		 
		
		Consumer<Aluno> alunoConsumer = t -> System.out.println(t);
		alunos.forEach(alunoConsumer);  */	
		
		System.out.println("Imprimindo com Method Reference! ");
		alunos.forEach(System.out::println);
		
	}
}
