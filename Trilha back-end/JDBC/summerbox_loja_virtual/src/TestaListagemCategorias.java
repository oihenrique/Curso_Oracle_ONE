import DAO.CategoriaDAO;
import factory.ConnectionFactory;
import modelo.Categoria;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemCategorias {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = new ConnectionFactory().recuperarConexao()){
            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> listaDeCategorias = categoriaDAO.listar();

            listaDeCategorias.forEach(ct -> System.out.println(ct.getNome()));
        }
    }
}
