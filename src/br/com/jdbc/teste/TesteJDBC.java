package br.com.jdbc.teste;

import br.com.jdbc.dao.ProdutoDAO;
import br.com.jdbc.model.Produto;;

public class TesteJDBC {
	public static void main(String[] args){
		Produto produto = new Produto(1, "Trofeu","Salgadinho", 1.25);
		
		ProdutoDAO c = new ProdutoDAO();
		c.inserir(produto);
		
		System.out.println("Id: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getValor());
	}

}
