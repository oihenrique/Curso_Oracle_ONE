package main.conversor;

/**
 * A classe ConversorMethods contém métodos para realização de cálculos de conversão entre moedas.
 *
 * @author Henrique Gomes.
 */
public class ConversorMethods {
    /**
     * O método converterDeRealPara realiza a conversão de um valor em real para um valor em outra moeda baseado no valor de sua cotação e retorna o resultado.
     * @param valor: valor em reais que será convertido;
     * @param moedaCotacao: valor de cotação da moeda estrangeira.
     */
    public double converterDeRealPara(double valor, double moedaCotacao){
        return valor / moedaCotacao;
    }

    /**
     * O método converterDeRealPara realiza a conversão de uma moeda estrangeira para um valor em reais e retorna o resultado.
     * @param valor: valor que será convertido;
     * @param moedaCotacao: valor de cotação da moeda estrangeira.
     */
    public double converterParaReal(double valor, double moedaCotacao){
        return valor * moedaCotacao;

    }

}
