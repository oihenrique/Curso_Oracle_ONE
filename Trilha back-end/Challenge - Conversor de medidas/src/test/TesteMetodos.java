package test;

import main.conversor.ConversorMethods;
import main.conversor.UIComponents;

public class TesteMetodos {
    public static void main(String[] args) {
        ConversorMethods conversor = new ConversorMethods();
        UIComponents components = new UIComponents();

        //System.out.println(conversor.converterDeRealPara(cotacao.getDolar(), 200));
        //System.out.println(conversor.converterParaReal(cotacao.getDolar(), 200));

        Double testInput = components.exibirDoubleInput("TESTE");

    }
}
