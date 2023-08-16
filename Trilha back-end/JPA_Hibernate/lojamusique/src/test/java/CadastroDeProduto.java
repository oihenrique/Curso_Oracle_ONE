import br.com.lojamusique.DAO.CategoriaDao;
import br.com.lojamusique.DAO.ProdutoDao;
import br.com.lojamusique.Util.JPAUtil;
import br.com.lojamusique.model.Categoria;
import br.com.lojamusique.model.Produto;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {
        Categoria celulares = new Categoria("CELULARES");

        Produto celular = new Produto("Motorola E5", "4gb tela led", new BigDecimal("1800"), celulares);

        EntityManager em = JPAUtil.getEntityManager();

        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin(); // iniciando a transação para o BD
        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);
        em.getTransaction().commit(); // comitando a transação, pode ser usando flush() também
        em.clear(); // ou close()
        //celulares = em.merge(celulares); para voltar ao estado managed
        //em.remove(celulares);
        //em.close();
    }
}
