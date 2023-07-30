package br.com.henribank.banco.Model;

// package br.com.henribank.banco.Model.CalculadorDeImposto => FQN
public class CalculadorDeImposto {

    private double totalImposto;
    public void registrar(Tributavel tributo) {
        // Full Qualified Name FQN
        double valor = tributo.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
