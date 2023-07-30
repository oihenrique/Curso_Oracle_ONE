package br.com.henribank.banco.Test;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.GuardadorDeContas;

public class TesteGuardadorContas {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();
        Conta cc = new ContaCorrente(333, 4441);
        Conta cc2 = new ContaCorrente(111, 1212);

        guardador.adicionar(cc);
        guardador.adicionar(cc2);

        System.out.println(guardador.getQuantidadeDeElementos());

        Conta ref = guardador.getReferencia(0);

        System.out.println(ref.getNumero());
    }
}
