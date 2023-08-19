package br.com.lojamusique.DAO;

import br.com.lojamusique.model.Pedido;
import br.com.lojamusique.model.RelatorioDeVendasVO;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;


public class PedidoDao {

    private EntityManager em;

    public PedidoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido pedido) {
        this.em.persist(pedido);
    }

    public BigDecimal valorTotalVendido() {
        String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
        return em.createQuery(jpql, BigDecimal.class).getSingleResult();
    }

    public List<RelatorioDeVendasVO> relatorioDeVendas() {
        String jpql = "SELECT new br.com.lojamusique.model.RelatorioDeVendasVO(" // criando a instancia de uma classe sem criar uma entidade
                + "produto.nome, "
                + "SUM(item.quantidade) as totalQuantidade, "
                + "MAX(pedido.dataPedido)) "
                + "FROM Pedido pedido "
                + "JOIN pedido.itens item "
                + "JOIN item.produto produto "
                + "GROUP BY produto.nome " // filtrando
                + "ORDER BY totalQuantidade DESC"; // ordenando por ordem decrescente

        return em.createQuery(jpql, RelatorioDeVendasVO.class).getResultList();
    }

}
