package br.com.lojamusique.model;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
//    @EmbeddedId
//    private CategoriaId id;

    public Categoria() {
    }

//    public Categoria(String nome) {
//        this.id = new CategoriaId(nome, "XPTO");
//    }


    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        //return this.id.getNome();
        return this.nome;
    }

    public void setNome(String nome) {
        //this.id.setNome(nome);
        this.nome = nome;
    }
}
