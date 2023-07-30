package br.com.henribank.banco.Test.util;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<Conta>();
        //ArrayList lista = new ArrayList(26); // definindo capacidade inicial

        Conta cc = new ContaCorrente(111, 1101);
        Conta cc2 = new ContaCorrente(222, 2202);
        Conta cc3 = new ContaCorrente(333, 3303);
        Conta cc4 = new ContaCorrente(444, 4404);

        lista.add(cc);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Tamanho: " + lista.size());

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("--------------------------------------");

        for (Conta oRef : lista) {
            System.out.println(oRef);
        }

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

    }
}
