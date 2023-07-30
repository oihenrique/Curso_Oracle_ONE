package main.util;

/**
 * Esta enumeração representa os tipos de conversão de temperatura que estão disponíveis no programa.
 *
 * @author Henrique Gomes
 */
public enum Temperaturas {
    CELSIUS_PARA_FAHRENHEIT("Celsius para Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius para Kelvin"),
    FAHRENHEIT_PARA_CELSIUS("Fahrenheit para Celsius"),
    KELVIN_PARA_CELSIUS("Fahrenheit para Kelvin");

    private final String descricao;

    Temperaturas(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
