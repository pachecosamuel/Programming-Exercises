package br.org.serratec.model;
import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Samuel Pacheco
 * @version 1.0
 * @since criada em 29/04/2022
 *
 */


public class Fornecedor implements Serializable{

	/**
	 *  @implNote implementar parãrã ...
	 *  */

	/**
	 *  Sei lá
	 */
	private static final long serialVersionUID = 1L;

	
	
	private String cnpj;
	private String nome;
	private String email;
	private Double comissao;
	

	/**
	 * @param cnpj
	 * ...
	 * @param nome
	 * ...
	 * @param email
	 * ...
	 * @param comissao
	 * ...
	 */
	public Fornecedor(String cnpj, String nome, String email, Double comissao) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.comissao = comissao;
	}

	
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email  + " comissão:" + comissao +  "] \n";
	}
	
	/*
	 * @return
	 * Return client's cnpj;
	 * */

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}


	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	
//	
	/**Método criado p/  calcular pgmt dos fornecedores..
	 * @author 
	 * Samuel Pacheco
	 * @since 
	 * 29/04/2022
	 * @param
	 *  valor ..
	 * @return return the payment value calculation
	 * @throws IllegalArgumentException caso 
	 */
	public Double calcularPagamento(double valor) throws IllegalArgumentException{
		return 0.0;
	}
	
	
	
	/** Este método imprime uma listagem de todos os fornecedores
	 * @author Samuel Pacheco
	 * @since 29/04/2022
	 */
	public void listarFornecedores() {
		
	}
	
	
	
}
