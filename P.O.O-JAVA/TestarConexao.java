package br.org.serratec.persistence;

import java.sql.Connection;

public class TestarConexao {

	public static void main(String[] args) {

		Connection connection = ConnectionFactorySingleton.getConnection();
		System.out.println();
		
	}

}
