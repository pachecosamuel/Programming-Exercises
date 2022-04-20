package org.serratec.model;

public class Pessoa {
	private int codigoPessoa;
	private String nome;
	private double peso, altura;

	public void setCodigo(int codigoPessoa) {
		if (codigoPessoa < 0) {
			System.out.println("Código inválido");
		} else {
			this.codigoPessoa = codigoPessoa;
		}
			
			
		
	}

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCodigoPessoa(int codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public double calcularIMC() {
		double IMC = peso / (altura * altura);
		return IMC;
	}

	public String resultado() {
		String result;

		if (calcularIMC() < 18.5) {
			result = "Abaixo do peso";
		} else if (calcularIMC() > 18.5 && calcularIMC() <= 24.9) {
			result = "Peso ideal";
		} else {
			result = "Acima do peso";
		}

		return result;
	}

}
