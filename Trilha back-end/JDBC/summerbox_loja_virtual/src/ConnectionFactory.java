import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Factory methods
public class ConnectionFactory {

    public Connection recuperarConexao() throws SQLException {
        // classe para carregar as variáveis de ambiente
        Properties properties = new Properties();

        try {
            // carregando as variáveis de ambiente de um arquivo
            properties.load(Files.newInputStream(Paths.get("config.properties")));

            // Armazenando os valores nas variáveis
            String dbUrl = properties.getProperty("db.url");
            String dbUser = properties.getProperty("db.user");
            String dbPassword = properties.getProperty("db.password");

            // criando conexão com o banco de dados
            return DriverManager.getConnection(dbUrl, dbUser, dbPassword);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}