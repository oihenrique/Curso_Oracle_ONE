package br.com.henribank.banco.especial;
import br.com.henribank.banco.Model.Conta;

public class ContaEspecial extends Conta{

    public ContaEspecial (int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
