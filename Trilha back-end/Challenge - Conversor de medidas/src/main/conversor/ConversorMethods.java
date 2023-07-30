package main.conversor;

/**
 * A classe ConversorMethods contém métodos para realização de cálculos de conversão entre unidades de moeda e de temperaturas.
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

    /**
     * Realiza a conversão entre um valor em graus Celsius para graus Fahrenheit.
     *
     * @param valor valor em graus Celsius;
     * @return valor em graus Fahrenheit.
     */
    public double converterCelsiusFahrenheit(double valor){
        return (valor * 1.8) + 32;
    }

    /**
     * Realiza a conversão entre um valor em graus Celsius para Kelvin.
     *
     * @param valor valor em graus Celsius;
     * @return valor em Kelvin.
     */
    public double converterCelsiusKelvin(double valor){
        return valor + 273.15;
    }

    /**
     * Realiza a conversão entre graus Fahrenheit e graus Celsius.
     *
     * @param valor valor em graus Fahrenheit;
     * @return valor em graus Celsius.
     */
    public double converterFahrenheitCelsius(double valor){
        return (valor - 32) / 1.8;
    }

    /**
     * Realiza a conversão entre Kelvin e graus Celsius.
     *
     * @param valor valor em Kelvin;
     * @return valor em graus Celsius.
     */
    public double converterKelvinCelsius(double valor){
        return valor - 273-15;
    }
}
