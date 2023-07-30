package br.com.henribank.banco.Model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public String toString() {
        return "ContaPoupanca, " + super.toString();
    }

}
