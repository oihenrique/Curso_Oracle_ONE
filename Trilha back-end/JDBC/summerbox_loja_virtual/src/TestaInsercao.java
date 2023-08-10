import factory.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaInsercao {

    public static void main(String[] args) throws SQLException {

        String nome = "";
        String descricao = "";

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperarConexao();

        // realizando inserção de dados no banco de dados
        PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) values (? , ?)", PreparedStatement.RETURN_GENERATED_KEYS);

        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();

        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()) {
            Integer id = rst.getInt(1);
            System.out.println("O id criado foi: " + id);
        }
    }
}
