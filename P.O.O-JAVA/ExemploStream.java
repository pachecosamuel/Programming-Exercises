package br.org.serratec.interfaces;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.org.serratec.model.Aluno;

public class ExemploStream {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(1, "Samu", "samu@g.com", 24);
		Aluno a2 = new Aluno(2, "Danubia", "dan@g.com", 26);
		Aluno a3 = new Aluno(3, "Anitta", "ant@g.com", 30);
		Aluno a4 = new Aluno(4, "PA", "pa@g.com", 27);
		Aluno a5 = new Aluno(5, "Scooby", "scooby@g.com", 28);

		List<String> cores = Arrays.asList("Ouro" , "Verde turquesa" , "Azul");
		Stream<String> streamCores = cores.stream();
		//streamCores.forEach(c -> System.out.println(c));
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		Stream<Aluno> streamAlunos = alunos.stream();
		
		List<String> nomes = streamAlunos.map(a -> a.getNome().substring(0, 2)).collect(Collectors.toList());
		System.out.println(nomes);
		
	}

}
