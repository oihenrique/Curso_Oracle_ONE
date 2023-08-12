package br.com.summerbox.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.summerbox.dao.ProdutoDAO;
import br.com.summerbox.factory.ConnectionFactory;
import br.com.summerbox.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;
	public void deletar(Integer id) {
		System.out.println("Deletando produto");
	}

	public void salvar(Produto produto) {
		System.out.println("Salvando produto");
	}

	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public List<Produto> listar() {
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Nome do Produto de teste", "Descrição do produto de teste"));
		return produtos;
	}

	public void alterar(String nome, String descricao, Integer id) {
		System.out.println("Alterando produto");
	}
}
