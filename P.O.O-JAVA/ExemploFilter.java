package br.org.serratec.interfaces;

import java.util.Arrays;
import java.util.List;

import br.org.serratec.model.Aluno;

public class ExemploFilter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno(1, "Samu", "samu@g.com", 24);
		Aluno a2 = new Aluno(2, "Danubia", "dan@g.com", 26);
		Aluno a3 = new Aluno(3, "Anitta", "ant@g.com", 30);
		Aluno a4 = new Aluno(4, "PA", "pa@g.com", 27);
		Aluno a5 = new Aluno(5, "Scooby", "scooby@g.com", 28);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		//Filtro por idade
		//alunos.stream().filter(a -> a.getIdade() > 20).forEach(a -> System.out.println(a));
	
		//Filtro por nome
		//alunos.stream().filter(a-> a.getNome().startsWith("S")).forEach(a -> System.out.println(a));
		
		//Ignorar o primeiro elemento
		//alunos.stream().skip(1).forEach(a -> System.out.println(a));
		
		//Limitar o resultado
		//alunos.stream().limit(0)
	}

}
