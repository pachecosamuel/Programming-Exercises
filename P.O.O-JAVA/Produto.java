package org.serratec.model;

public class Produto {
		private int codigo;
		private String descricao;
		private double valor;
		public int getCodigo() {
			return codigo;
		}
		
		public Produto(int codigo, String descricao, double valor) {
			this.descricao = descricao;
			this.codigo = codigo;
			this.valor = valor;
			System.out.println("Construtor cheio");
		}
		
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
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
		
		
}
