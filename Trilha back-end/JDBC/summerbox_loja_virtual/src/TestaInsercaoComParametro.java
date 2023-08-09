import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {
        String nome = "Notebook Acer i3 4GB";
        String descricao = "Notebook Acer";

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperarConexao();

        // realizando inserção de dados no banco de dados utilizando o PreparedStatement para evitar SQL Injection
        PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) values (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

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
