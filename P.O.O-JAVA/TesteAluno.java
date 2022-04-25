package review.cap.nove;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {

		Ex01_Aluno a1 = new Ex01_Aluno("Samuel", 9.8, 8.5);
		Ex01_Aluno a2 = new Ex01_Aluno("Tales", 7.8, 9.2);
		Ex01_Aluno a3 = new Ex01_Aluno("Danubia", 9.0, 7.3);
		
		List<Ex01_Aluno> listaAluno = new ArrayList<>();
		listaAluno.add(a1);
		listaAluno.add(a2);
		listaAluno.add(a3);
		
		a3.calcularMedia(a3.getN1(), a3.getN2());
		
		System.out.println("Qtd alunos: " + listaAluno.size());
		
		for (Ex01_Aluno aluno : listaAluno) {
			try {
				System.out.println(aluno.toString());
				System.out.println("Média: " + aluno.calcularMedia(aluno.getN1(), aluno.getN2()));
			} catch (Ex01_AlunoException e) {
				//System.out.println(e.getMessage());
			}
		}
		
		/*try {
			System.out.println(a1.calcularMedia(9.8, -8.5));
		} catch (Ex01_AlunoException e) {
			System.out.println(e.getMessage());
		}*/
		
		
		
	}

}
