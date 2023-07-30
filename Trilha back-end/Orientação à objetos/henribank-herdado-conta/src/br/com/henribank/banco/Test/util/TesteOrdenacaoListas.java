package br.com.henribank.banco.Test.util;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacaoListas {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.depositar(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(comparator);

        System.out.println("---------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }

    static class NumeroDaContaComparator implements Comparator<Conta> {

        @Override
        public int compare(Conta c1, Conta c2) {
            return Integer.compare(c1.getNumero(), c2.getNumero());
        }
    }
}
