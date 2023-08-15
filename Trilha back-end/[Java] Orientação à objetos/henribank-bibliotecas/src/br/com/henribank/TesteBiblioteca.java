package br.com.henribank;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;

public class TesteBiblioteca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(222, 333);

        conta.depositar(200);

        System.out.println(conta.getSaldo());
    }
}
