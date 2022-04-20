package br.com.senai.model;

import java.time.LocalDate;

public class Pedido {

	private int numero, quantidade;
	private LocalDate dataDoPedido;
	private double valor;
	private static double totalPedidos = 0.0;
	
	public static double getTotalPedidos() {
		return totalPedidos;
	}

	public Pedido(int numero, int quantidade, LocalDate dataDoPedido, double valor) {
		this.numero = numero;
		this.quantidade = quantidade;
		this.dataDoPedido = dataDoPedido;
		this.valor = valor;
	}

	public static void setTotalPedidos(double totalPedidos) {
		Pedido.totalPedidos = totalPedidos;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public LocalDate getDataDoPedido() {
		return dataDoPedido;
	}
	public void setDataDoPedido(LocalDate dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double finalizarPedido() {
		if (dataDoPedido.getDayOfWeek().getValue() == 7) {
			totalPedidos += (valor * quantidade) * 0.9;
			return quantidade * valor * 0.9;
		} else {
			totalPedidos += quantidade * valor;
			return quantidade * valor;
		}
	}
	

	
	
	
	
}
