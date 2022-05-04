package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ClienteDao {

	private Connection conexao;

	public ClienteDao() {
		conexao = new ConnectionFactory().getConnection();
	}

	public void inserir(Produto cliente) {
		try {
			String sql = "insert into cliente (nome, telefone, email) values (?,?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println("Não foi possível gravar o registro!");
		}
	}

	public void atualizar(Produto cliente) {
		try {
			String sql = "update cliente set nome=?, telefone=?, email=? where codigo =?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTelefone());
			stmt.setString(3, cliente.getEmail());
			stmt.setInt(4, cliente.getCodigo());
			stmt.execute();
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println("Não foi possível att o registro!");
		}
	}

	public void apagar(int codigo) {
		try {
			String sql = "delete from cliente where codigo=?";
			PreparedStatement stmt;
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			System.out.println("Erro ao excluir um cliente!");
		}
	}
	
	public List<Produto> listar(){
		String sql = "select * from public.cliente";
		List<Produto> clientes = new ArrayList<>();
		try {
			PreparedStatement stmt;
			stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto cliente = new Produto(rs.getInt("codigo"),
						rs.getString("nome"),
						rs.getString("telefone"), 
						rs.getString("email"));
				clientes.add(cliente);
			}
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println("Erro ao listar");
		}
		return clientes;
	}
	
	
	public Produto buscar(int codigo) {
		String sql = "select * from cliente where codigo =?";
		Produto cliente = null;
		try {
			PreparedStatement stmt;
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
						cliente = new Produto(rs.getInt("codigo"),
						rs.getString("nome"),
						rs.getString("telefone"), 
						rs.getString("email"));
			}
			stmt.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println("Erro ao buscar cliente");
		}
		return cliente;
	}

}
