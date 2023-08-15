import br.com.lojamusique.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {
        Produto celular = new Produto();

        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Redmi Note 4GB ram");
        celular.setPreco(new BigDecimal("1300"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojamusique"); // criando a conexão com o BD
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin(); // iniciando a transação para o BD
        em.persist(celular); // realiza o insert
        em.getTransaction().commit(); // comitando a transação
        em.close();
    }
}
