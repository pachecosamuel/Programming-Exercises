package br.org.serratec.interfaces;

import java.util.List;

import br.org.serratec.model.Produto;

public interface ProdutoImpl extends CrudGenerico<Produto>{

	public List<Produto> buscaPorNome(String nome);
	
}
