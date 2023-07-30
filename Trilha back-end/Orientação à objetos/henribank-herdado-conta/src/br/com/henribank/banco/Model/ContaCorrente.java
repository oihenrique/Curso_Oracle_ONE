package br.com.henribank.banco.Model;

public class ContaCorrente extends Conta implements Tributavel {

    private double valorImposto;
    // precisa declarar um construtor padrão ou específico, construrotes não são herdados
    public ContaCorrente (int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.sacar(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.1;
    }

    @Override
    public String toString() {
        return "ContaCorrente, " + super.toString();
    }

}
