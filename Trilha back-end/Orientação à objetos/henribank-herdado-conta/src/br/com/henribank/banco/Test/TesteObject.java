package br.com.henribank.banco.Test;

import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.ContaPoupanca;

public class TesteObject {

    public static void main(String[] args) {

        Object cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
}