package br.com.lojamusique.DAO;

import br.com.lojamusique.model.Categoria;

import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }

    public void atualizar(Categoria categoria) {
        this.em.merge(categoria);
    }

    public void excluir(Categoria categoria) {
        categoria = em.merge(categoria);
        this.em.remove(categoria);
    }
}
