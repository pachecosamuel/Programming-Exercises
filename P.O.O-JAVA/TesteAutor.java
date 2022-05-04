package review_16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TesteAutor {

	public static void main(String[] args) {

		Autor a1 = new Autor("Napoleon Hill", "Mais esperto que o diabo");
		Autor a2 = new Autor("Paulo Coelho", "O alquimista");
		
		List<Autor> autores = Arrays.asList(a1,a2);
		
		Consumer<Autor> ccl = a -> a.imprime();
		Consumer<Autor> ccmr = Autor::imprime;
		
		/*autores.forEach(ccmr);
		System.out.println("----------------------------");
		autores.forEach(ccl);
		System.out.println("----------------------------");
		autores.forEach(Autor::imprime);*/
		
		autores.forEach(System.out::println);

		
		
	}

}
