package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class RepositorioProdutos {
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public RepositorioProdutos() {
	}

	public void addProduto(Produto p) {
		produtos.add(p);
	}

}
