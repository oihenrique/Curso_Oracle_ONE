package br.com.lojamusique.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity // indicado que essa classe representa uma entidade
@Table(name = "produtos") // especificando que o nome da tabela no banco de dados é "produtos" para que ele não confunda com o nome da classe
public class Produto {

    @Id // indicando que essa é a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identificando que o valor é gerado no banco de dados e não na aplicação
    private Long id;
    private String nome;
    //@Column (name = "desc")
    private String descricao;
    private BigDecimal preco;

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
