package br.org.serratec.persistence;

import java.sql.Connection;
import java.sql.SQLException;

import br.org.serratec.model.Produto;

public class TesteTransacao {

	public static void main(String[] args) {

		Produto p1 = new Produto(null, "Mexirica", "Pokan", 4.50, 200);	
		Produto p2 = new Produto(null, "Banana", "Prata", 3.50, 150);	
		Produto p3 = new Produto(null, "Maçã", "Red", 11.50, 100);	
		
		//ProdutoDAO dao = new ProdutoDAO();
		

		Connection connection = ConnectionFactorySingleton.getConnection();
		try {
			connection.setAutoCommit(false);
			ProdutoDAO dao = new ProdutoDAO(connection);
			dao.inserir(p1);
			dao.inserir(p2);
			dao.inserir(p3);
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
		
	}

}
