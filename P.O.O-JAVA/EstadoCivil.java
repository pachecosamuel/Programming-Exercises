package br.org.serratec.enumaradores;

public enum EstadoCivil {

	
	CASADO (' c ') , SOLTEIRO(' S '), VIUVO(' V '), DIVORCIADO(' D ');

	private char valor;

	private EstadoCivil(char valor) {
		this.valor = valor;
	}

	public char getValor() {
		return valor;
	}
	
	
}
