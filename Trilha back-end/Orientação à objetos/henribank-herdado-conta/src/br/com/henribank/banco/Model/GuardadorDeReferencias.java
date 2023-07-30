package br.com.henribank.banco.Model;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Object ref) {
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre ++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int refIndex) {
        return this.referencias[refIndex];
    }
}
