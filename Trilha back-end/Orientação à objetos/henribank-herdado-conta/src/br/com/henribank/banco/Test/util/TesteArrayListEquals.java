package br.com.henribank.banco.Test.util;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();
        //ArrayList lista = new ArrayList(26); // definindo capacidade inicial

        Conta cc = new ContaCorrente(111, 1101);
        Conta cc2 = new ContaCorrente(222, 2202);
        Conta cc3 = new ContaCorrente(333, 3303);
        Conta cc4 = new ContaCorrente(444, 4404);

        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        boolean existe = lista.contains(cc2);
        System.out.println(existe);

    }
}
