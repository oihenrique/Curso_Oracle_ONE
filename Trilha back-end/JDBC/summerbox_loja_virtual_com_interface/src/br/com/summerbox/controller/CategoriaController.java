package br.com.summerbox.controller;

import java.sql.Connection;
import java.util.List;

import br.com.summerbox.dao.CategoriaDAO;
import br.com.summerbox.factory.ConnectionFactory;
import br.com.summerbox.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;

	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}

	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}
