package persistence;

import java.util.Iterator;

import model.Produto;

public class TesteDao {

	public static void main(String[] args) {

		ClienteDao dao = new ClienteDao();
		//Cliente c1 = new Cliente(null, "Danubia", "123456", "danubia@gmail.com");
		//dao.inserir(c1);
		
		//Cliente c2 = new Cliente(1, "Jão da Silva", "22455445", "Jão@123.com");
		//dao.atualizar(c2);
		
		//dao.apagar(1);	 se executar vai apagar a primeira posicao
		
		//System.out.println(dao.listar());
		/*for (Cliente cliente : dao.listar()) {
			System.out.println(cliente);
		}*/
		
		System.out.println(dao.buscar(1));
		
		
	}

}
