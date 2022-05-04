package review_16;

import java.util.function.Consumer;

public class ExibeDados implements Consumer<Aluno> {

	@Override
	public void accept(Aluno t) {
		System.out.println("Nome: " + t.getNome());
		System.out.println("Matrícula: " + t.getMatricula());
	}

}
