import br.com.lojamusique.DAO.CategoriaDao;
import br.com.lojamusique.DAO.ClienteDao;
import br.com.lojamusique.DAO.PedidoDao;
import br.com.lojamusique.DAO.ProdutoDao;
import br.com.lojamusique.Util.JPAUtil;
import br.com.lojamusique.model.*;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDePedido {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        ClienteDao clienteDao = new ClienteDao(em);
        PedidoDao pedidoDao = new PedidoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        Categoria categoria = new Categoria("Eletrônicos");
        categoriaDao.cadastrar(categoria);

        Cliente sabrininha = new Cliente("Sabrina", "222.222.222-00");
        clienteDao.cadastrar(sabrininha);

        Pedido pedido = new Pedido(sabrininha);
        Produto televisaoLcd = new Produto("Playstation 3", "PS3", new BigDecimal("2000"), categoria);
        produtoDao.cadastrar(televisaoLcd);
        pedido.adicionarItem(new ItemPedido(10, pedido, televisaoLcd));
        pedidoDao.cadastrar(pedido);

        em.getTransaction().begin();
        em.getTransaction().commit();

        BigDecimal totalVendido = pedidoDao.valorTotalVendido();
        System.out.println("Valor toral: " + totalVendido);

        List<RelatorioDeVendasVO> relatorioDeVendas = pedidoDao.relatorioDeVendas();
        relatorioDeVendas.forEach(System.out::println);
        
        em.close();
    }
}
