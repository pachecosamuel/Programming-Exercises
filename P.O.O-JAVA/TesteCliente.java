package exercicioArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {

		ListaCliente lc = new ListaCliente();
		//Cliente c1 = new Cliente();
		Scanner x = new Scanner(System.in);
		List<Cliente> listaClientes = new ArrayList();
		
		//lc.cadastraCliente(c1);
		//ArrayList<Cliente> clientes = new ArrayList<>();	

		do {
			System.out.println("Digite o nome: ");
			listaClientes.add(new Cliente(x.next(), x.next(), x.next(), x.nextInt()));
			
		} while ();
		
		
	}

}
