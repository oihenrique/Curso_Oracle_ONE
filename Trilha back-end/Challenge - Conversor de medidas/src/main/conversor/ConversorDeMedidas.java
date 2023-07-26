package main.conversor;

public class ConversorDeMedidas {

    public double converterDeRealPara(double moedaConversao, double valor){
        return valor / moedaConversao;
    }

    public double converterParaReal(double moedaConversao, double valor){
        return valor * moedaConversao;
    }

}
