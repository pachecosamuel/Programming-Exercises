package br.org.serratec.enumaradores;

public class TesteCurso {

	public static void main(String[] args) {
		
	Turma turma = new Turma("Java WEB", PeriodoCurso.NOTURNO);
	
	System.out.println("Curso" + turma.getCurso());
	System.out.println("Turno do Curso: " + turma.getPeriodocurso());
	
	
	}
}
