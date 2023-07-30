package br.com.henribank.banco.Model;

/**
 * Classe que representa um cliente no Henribank.
 *
 * @author Henrique Gomes
 * @version 0.1
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
