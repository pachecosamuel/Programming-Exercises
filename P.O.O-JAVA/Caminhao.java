package br.com.senai.model;

public class Caminhao extends Veiculo {
	private int cargaMaxima;

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public String toString() {
		return "Caminhao [cargaMaxima=" + cargaMaxima + ", chassi=" + chassi + ", placa=" + placa + ", cor=" + cor
				+ ", valorIPVA=" + valorIPVA + ", getCargaMaxima()=" + getCargaMaxima() + ", getChassi()=" + getChassi()
				+ ", getPlaca()=" + getPlaca() + ", getCor()=" + getCor() + ", getValorIPVA()=" + getValorIPVA()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void adicionarValorIPVA(double valor) {
		// TODO Auto-generated method stub
		super.adicionarValorIPVA(valor*2);
	}
	
	//Sobrescrita de método = Overriding
	
	/*@Override
	public void adicionarValorIPVA(double valor) {
		// TODO Auto-generated method stub
		valorIPVA += valor * 2;
	}*/
	
	
	
}
