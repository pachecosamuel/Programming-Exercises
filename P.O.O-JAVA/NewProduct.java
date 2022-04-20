package org.serratec.model;

public class NewProduct {

	private String descricao;
	private double valor;
	private int qtd;
	
	/*public NewProduct(String descricao, double valor, int qtd) {
		this.descricao = descricao;
		this.valor = valor;
		this.qtd = qtd;
	}*/
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double calcularICMS(double valor) {
		return valor * 0.12;
	}
	
	
	
	
	
	
	
}
