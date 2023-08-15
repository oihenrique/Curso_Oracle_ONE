package br.com.henribank.banco.Test;

import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.ContaPoupanca;
import br.com.henribank.banco.Model.SaldoInsuficienteException;

public class TestaContas {

    // java.lang.String
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cco = new ContaCorrente(111, 222);
        ContaPoupanca cpa = new ContaPoupanca(333, 444);
        cco.depositar(100);
        cpa.depositar(200);

        cco.transferir(10, cpa);

        System.out.println(cco.getSaldo());
        System.out.println(cpa.getSaldo());
    }
}
