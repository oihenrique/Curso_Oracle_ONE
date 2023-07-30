package br.com.henribank.banco.Test;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.SaldoInsuficienteException;

public class TesteSaque {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(333, 2222);

        conta.depositar(300);

        try {
            conta.sacar(310);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
