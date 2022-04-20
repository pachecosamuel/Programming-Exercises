package br.com.senai.model;

import java.time.LocalDate;
import java.util.Locale;

public class TestePedido {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Pedido p1 = new Pedido(123, 4, LocalDate.of(2022, 04, 12), 12.0);
		Pedido p2 = new Pedido(456, 3, LocalDate.of(2022, 04, 17), 10.0);
		Pedido p3 = new Pedido(789, 2, LocalDate.now(), 100.0);

		System.out.println(p1.finalizarPedido());
		System.out.println(p2.finalizarPedido());
		System.out.println(p3.finalizarPedido());
		
		System.out.println("O total do pedido é: " + Pedido.getTotalPedidos());
		
	}

}
