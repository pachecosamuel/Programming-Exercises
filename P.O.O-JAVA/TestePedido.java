package review_16;

public class TestePedido {

	public static void main(String[] args) {

		Pedido p1 = new Pedido();
		//p1.finalizarPedido();
		
		Pedido p2 = new Pedido() {

			@Override
			public void finalizarPedido() {
				System.out.println("A compra de seu Iphone 13 foi efetuada com sucesso!");
				//super.finalizarPedido();
			}
		};
		p2.finalizarPedido();
		
		
	}

}
