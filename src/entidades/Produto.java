package entidades;

public class Produto {
	private String nome;
	private String fabricante;
	private double preco;
	public String getNome() {
		return nome;
	}
	
	public Produto(String nome, String fabricante, double preco) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	

}
