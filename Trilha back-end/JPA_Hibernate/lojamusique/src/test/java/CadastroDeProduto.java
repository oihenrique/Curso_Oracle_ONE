import br.com.lojamusique.DAO.CategoriaDao;
import br.com.lojamusique.DAO.ProdutoDao;
import br.com.lojamusique.Util.JPAUtil;
import br.com.lojamusique.model.Categoria;
import br.com.lojamusique.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {

    public static void main(String[] args) {
        //cadastrarProduto();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto p = produtoDao.buscarPorId(1L);
        System.out.println(p.getPreco());

        //List<Produto> todos = produtoDao.buscarTodos();
        //todos.forEach(produto -> System.out.println(p.getNome()));

        //List<Produto> produto = produtoDao.buscarPorNome("Xiaomi Redmi");
        //produto.forEach(p2 -> System.out.println(p2.getNome()));

        List<Produto> produto = produtoDao.buscarPorNomeDaCategoria("Celulares");
        produto.forEach(p2 -> System.out.println(p2.getNome()));

        BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
        System.out.println("Preco do produto: " + precoDoProduto);

    }

    private static void cadastrarProduto() {
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
