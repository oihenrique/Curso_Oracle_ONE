package br.com.henribank.banco.Test;

import br.com.henribank.banco.Model.CalculadorDeImposto;
import br.com.henribank.banco.Model.ContaCorrente;
import br.com.henribank.banco.Model.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(222, 333);
        conta.depositar(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registrar(conta);
        calc.registrar(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
