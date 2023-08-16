package br.com.lojamusique.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("lojamusique"); // criando a conexão com o BD

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }


}
