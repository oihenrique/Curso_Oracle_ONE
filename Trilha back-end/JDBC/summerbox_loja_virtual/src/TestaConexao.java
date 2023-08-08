import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexao();

        // executando queries e coletando dados da tabela
        Statement stm = connection.createStatement();
        stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
        ResultSet rst = stm.getResultSet();

        while (rst.next()) {
            Integer id = rst.getInt("id");
            String nome = rst.getString("nome");
            String descricao = rst.getString("descricao");
            System.out.println(id);
            System.out.println(nome);
            System.out.println(descricao);
        }

        // fechando conexão com o banco de dados
        connection.close();
    }
}
