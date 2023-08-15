package br.com.henribank.banco.Test;

import br.com.henribank.banco.Model.Conta;
import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.ContaPoupanca;

public class TesteArrayReferencia {

    public static void main(String[] args) {
        Object[] referencias = new Object[5];
        Conta cc1 = new ContaCorrente(222, 3331);
        Conta cp2 = new ContaPoupanca(333, 4441);

        referencias[0] = cc1;
        referencias[1] = cp2;

        System.out.println(referencias[0]);
        System.out.println(referencias[1]);

        Conta referenciaGenerica = (Conta) referencias[0];
        //System.out.println(cc1.getNumero());
        System.out.println(referenciaGenerica.getNumero());

        Conta ref = (Conta) referencias[0];
        ContaPoupanca ref2 = (ContaPoupanca) referencias[1];

        System.out.println(ref.getNumero());
        System.out.println(ref2.getNumero());
    }
}
