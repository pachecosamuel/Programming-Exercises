package review_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteAluno {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Samuel", "274");
		Aluno a2 = new Aluno("Anitta", "269");
		
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(a1);
		lista.add(a2);
		
		//Consumer<Aluno> csm = t -> System.out.println("Nome: " + t.getNome() + " matrícula: " + t.getMatricula());
		
		/*lista.forEach(t -> {
			System.out.println(t.getNome());
		});*/
		
		System.out.println("imprimindo com reference");
		lista.forEach(System.out::println);
		
		
	}
}
