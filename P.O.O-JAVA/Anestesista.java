package br.com.senai.model;

public class Anestesista extends Medico {
		
	private double valorAnestesia;

	public Anestesista(String crm, String nome, double valorConsulta, double valorAnestesia) {
		super(crm, nome, valorConsulta);
		this.valorAnestesia = valorAnestesia;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nValor da anestesia: " + valorAnestesia;
	}

	public double getValorAnestesia() {
		return valorAnestesia;
	}

	
	
}
