package br.com.lojamusique.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity // indicado que essa classe representa uma entidade
@Table(name = "produtos")
// especificando que o nome da tabela no banco de dados é "produtos" para que ele não confunda com o nome da classe
@NamedQuery(name = "Produto.produtosPorCategoria", query = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome")
//Inheritance(strategy = InheritanceType.SINGLE_TABLE) // herdando para uma tabela única
@Inheritance(strategy = InheritanceType.JOINED) // herdando para tabelas separadas
public class Produto {

    @Id // indicando que essa é a primary key
    // identificando que o valor é gerado no banco de dados e não na aplicação
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    //@Column (name = "desc")
    private String descricao;
    private BigDecimal preco;
    private LocalDate dataCadastro = LocalDate.now();

    @ManyToOne(fetch = FetchType.LAZY)
    //@Enumerated(EnumType.STRING) // especificando para salvar no banco de dados como string
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
