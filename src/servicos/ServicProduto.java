package servicos;

import entidades.Produto;
import repositorios.RepositorioProdutos;

public class ServicProduto {
	private RepositorioProdutos repositorio;

	public ServicProduto() {
	}
	
	public void addProduto(String nome, String fabricante, double preco) {
		Produto p = new Produto(nome, fabricante, preco);
		repositorio.addProduto(p);
	}

}
