package exercicioArray;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente {

	ArrayList<Cliente> clientes = new ArrayList();
	
	public void cadastraCliente(Cliente clientes) {
		this.clientes.add(clientes);
	}
	
	public String numeroDeClientes() {
		return "Número de clientes cadastrados: " + clientes.size();
	}
	
}
