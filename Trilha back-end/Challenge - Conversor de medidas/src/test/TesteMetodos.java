package test;

import main.conversor.ConversorMethods;
import main.conversor.UIComponents;
import main.util.CotacaoMoedas;
import main.util.UtilMethods;

import javax.rmi.CORBA.Util;

public class TesteMetodos {
    public static void main(String[] args) {
        ConversorMethods conversor = new ConversorMethods();
        UIComponents components = new UIComponents();
        UtilMethods util = new UtilMethods();

        //System.out.println(conversor.converterDeRealPara(cotacao.getDolar(), 200));
        //System.out.println(conversor.converterParaReal(cotacao.getDolar(), 200));

        Double testInput = components.exibirDoubleInput();

        boolean x = util.verificarDoubleInput(testInput);

        System.out.println(x);

    }
}
