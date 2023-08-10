import factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();

        // try with resources fecha automaticamente a connection
        try(Connection connection = factory.recuperarConexao()) {

            // impedir que o jdbc realize o commit da query automaticamente
            connection.setAutoCommit(false);

            try (// realizando inserção de dados no banco de dados utilizando o PreparedStatement para evitar SQL Injection
                 PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) values (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS)) {

                adicionarVariavel("Smart TV", "45 polegadas", stm);
                adicionarVariavel("Radio", "Radio de bateria", stm);

                // realizando o commit manualmente após as inserções darem certo
                connection.commit();

            } catch (Exception e) {
                e.printStackTrace();

                // realizando rollback das informações caso ocorra um erro
                System.out.println("ROLLBACK EXECUTADO");
                connection.rollback();
            }
        }
    }

    private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setString(2, descricao);

        stm.execute();

        try (ResultSet rst = stm.getGeneratedKeys()) {
            while (rst.next()) {
                int id = rst.getInt(1);
                System.out.println("O id criado foi: " + id);
            }
        }
    }
}
