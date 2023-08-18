package br.com.lojamusique.DAO;

import br.com.lojamusique.model.Pedido;

import javax.persistence.EntityManager;


public class PedidoDao {

    private EntityManager em;

    public PedidoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido pedido) {
        this.em.persist(pedido);
    }
}
