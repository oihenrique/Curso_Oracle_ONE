import br.com.lojamusique.DAO.CategoriaDao;
import br.com.lojamusique.DAO.ClienteDao;
import br.com.lojamusique.DAO.PedidoDao;
import br.com.lojamusique.DAO.ProdutoDao;
import br.com.lojamusique.Util.JPAUtil;
import br.com.lojamusique.model.*;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDePedido {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        ClienteDao clienteDao = new ClienteDao(em);
        PedidoDao pedidoDao = new PedidoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        Categoria TV = new Categoria("TELEVISÃO");
        categoriaDao.cadastrar(TV);

        Cliente sabrininha = new Cliente("Sabrina", "222.222.222-00");
        clienteDao.cadastrar(sabrininha);

        Pedido pedido = new Pedido(sabrininha);
        Produto televisaoLcd = new Produto("TV LCD 4k 45 polegadas", "Televisao LCD", new BigDecimal("4000"), TV);
        produtoDao.cadastrar(televisaoLcd);
        pedido.adicionarItem(new ItemPedido(1, pedido, televisaoLcd));
        pedidoDao.cadastrar(pedido);

        em.getTransaction().begin();
        em.getTransaction().commit();
        em.close();
    }
}
