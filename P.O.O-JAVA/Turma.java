package br.org.serratec.enumaradores;

public class Turma {

	private String curso;
	private PeriodoCurso periodocurso;
	
	
	public Turma(String curso, PeriodoCurso periodocurso) {
		super();
		this.curso = curso;
		this.periodocurso = periodocurso;
	}
	
	public String getCurso() {
		return curso;
	}
	public PeriodoCurso getPeriodocurso() {
		return periodocurso;
	}

	@Override
	public String toString() {
		return "Turma [curso=" + curso + ", periodocurso=" + periodocurso + "]";
	}
	
	
	
}
