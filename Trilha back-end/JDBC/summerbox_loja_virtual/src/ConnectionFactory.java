import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

// Factory methods
public class ConnectionFactory {

    public DataSource dataSource;

    public ConnectionFactory(){
        // Documentação do c3p0: https://www.mchange.com/projects/c3p0/

        LoadDbAcessInfo dbAcess = new LoadDbAcessInfo();
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        comboPooledDataSource.setJdbcUrl(dbAcess.getDbUrl());
        comboPooledDataSource.setUser(dbAcess.getDbUser());
        comboPooledDataSource.setPassword(dbAcess.getDbPassword());

        comboPooledDataSource.setMaxPoolSize(15);

        this.dataSource = comboPooledDataSource;
    }

    public Connection recuperarConexao() {

        try {
            // criando conexão com o banco de dados, o data source já tem o método getConnection
            return this.dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}