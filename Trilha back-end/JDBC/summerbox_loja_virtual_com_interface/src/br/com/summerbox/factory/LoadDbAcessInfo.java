package br.com.summerbox.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class LoadDbAcessInfo {
    // instanciando classe para carregar as variáveis de ambiente
    Properties properties = new Properties();

    protected LoadDbAcessInfo() {
        // carregando as variáveis de ambiente por meio de um arquivo de configs
        try {
            properties.load(Files.newInputStream(Paths.get("config.properties")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected String getDbUrl() {
        // Armazenando os valores nas variáveis.
        return properties.getProperty("db.url");
    }
    protected String getDbUser() {
        // Armazenando os valores nas variáveis.
        return properties.getProperty("db.user");
    }
    protected String getDbPassword() {
        // Armazenando os valores nas variáveis.
        return properties.getProperty("db.password");
    }
}