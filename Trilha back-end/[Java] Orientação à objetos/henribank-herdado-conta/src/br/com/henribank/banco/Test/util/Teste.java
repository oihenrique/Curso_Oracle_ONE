package br.com.henribank.banco.Test.util;

import br.com.henribank.banco.Model.Cliente;
import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<>();

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        lista.forEach( (conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

        //Collections.sort(lista, new TitularDaContaComparator());

    }
}