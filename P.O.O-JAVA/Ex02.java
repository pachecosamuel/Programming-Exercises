package review.cap.nove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		/*Ex02_Cliente c1 = new Ex02_Cliente("Samuel", "99215", "111", 24);
		Ex02_Cliente c2 = new Ex02_Cliente("Carol", "98852", "222", 26);
		Ex02_Cliente c3 = new Ex02_Cliente("Chay", "99874", "333", 23);*/
		
		Scanner x = new Scanner(System.in);
		
		Ex02_Cliente c1 = new Ex02_Cliente();
		
		//c1.setId(x.next());
		
		System.out.println("Digite o id do cliente: ");
		c1.setId(x.next());
		System.out.println("O id do cliente é: " + c1.getId());
		
		
		
		List<Ex02_Cliente> lista = new ArrayList<>();
		
		/*lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		for (Ex02_Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}*/

		
		
		x.close();
	}

}
