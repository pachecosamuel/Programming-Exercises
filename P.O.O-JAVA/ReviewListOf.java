package review.cap.nove;

import java.util.List;

public class ReviewListOf {

	public static void main(String[] args) {

		String[] cores = {"Amarelo" , "Verde" , "Azul"};
		List coresOrixas = List.of(cores);
		
		System.out.println(coresOrixas);

		cores[0] = "Amarelo ouro";
		
		for (int i = 0; i < cores.length; i++) {
			System.out.println("A cor é: " + cores[i]);
		}

		
		System.out.println(coresOrixas);
		
	}

}
