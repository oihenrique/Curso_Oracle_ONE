import DAO.ProdutoDAO;
import factory.ConnectionFactory;
import modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaConexaoEListagemComProduto {

    public static void main(String[] args) throws SQLException {

        Produto produtoAdd = new Produto("PlayStation 1", "Playstation 1 1998");

        try (Connection connection = new ConnectionFactory().recuperarConexao()){
            ProdutoDAO produtoDao = new ProdutoDAO(connection);
            produtoDao.salvarProduto(produtoAdd);
            List<Produto> listaDeProdutos = produtoDao.listar();
            listaDeProdutos.forEach(lp -> System.out.println(lp));
        }
    }
}
