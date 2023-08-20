package br.com.lojamusique.model;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private DadosPessoais dadosPessoais;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.dadosPessoais = new DadosPessoais(nome, cpf);
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return this.dadosPessoais.getNome();
    }

    public void setNome(String nome) {
        this.dadosPessoais.setNome(nome);
    }

    public String getCpf() {
        return this.dadosPessoais.getCpf();
    }

    public void setCpf(String cpf) {
        this.dadosPessoais.setCpf(cpf);
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }
}
