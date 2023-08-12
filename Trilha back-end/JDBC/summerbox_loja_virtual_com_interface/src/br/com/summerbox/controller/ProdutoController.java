package br.com.summerbox.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.summerbox.dao.ProdutoDAO;
import br.com.summerbox.factory.ConnectionFactory;
import br.com.summerbox.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		produtoDAO.deletar(id);
		System.out.println("Deletando produto");
	}

	public void salvar(Produto produto) {
		produtoDAO.salvar(produto);
		System.out.println("Salvando produto");
	}

	public void alterar(String nome, String descricao, Integer id) {
		produtoDAO.alterar(nome, descricao, id);
		System.out.println("Alterando produto");
	}

	public List<Produto> listar() {
		return produtoDAO.listar();
	}

}
