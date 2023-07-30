package br.com.henribank.banco.Test;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(333, 4441);
        Conta cc2 = new ContaCorrente(111, 1212);

        guardador.adicionar(cc);
        guardador.adicionar(cc2);

        System.out.println(guardador.getQuantidadeDeElementos());

        Conta ref = (Conta) guardador.getReferencia(0);

        System.out.println(ref.getNumero());
    }
}
