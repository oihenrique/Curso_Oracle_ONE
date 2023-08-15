package br.com.henribank.banco.Model;

public class SeguroDeVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}
