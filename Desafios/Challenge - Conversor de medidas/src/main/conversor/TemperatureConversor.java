package main.conversor;

import main.util.Temperaturas;

/**
 * A classe TemperatureConversor exibe uma interface interativa ao usuário, permitindo que ele insira um valor de temperatura para ser convertido para outra unidade de medida.
 *
 * @author Henrique Gomes
 */
public class TemperatureConversor {

    public TemperatureConversor() {
        Exceptions exceptions = new Exceptions();
        UIComponents components = new UIComponents();
        ConversorMethods conversor = new ConversorMethods();

        double valorTemperatura = 0;
        double resultado;

        Object[] escolhaDeTemperatura = {Temperaturas.CELSIUS_PARA_FAHRENHEIT.getDescricao(), Temperaturas.CELSIUS_PARA_KELVIN.getDescricao(), Temperaturas.FAHRENHEIT_PARA_CELSIUS.getDescricao(), Temperaturas.KELVIN_PARA_CELSIUS.getDescricao()};

        String temperaturaEscolhida = components.exibirOpcoes("Conversor de temperaturas", escolhaDeTemperatura);

        try {
            valorTemperatura = components.exibirDoubleInput("Conversor de temperaturas");
        } catch (NumberFormatException exception) {
            exceptions.InvalidArgumentException();
            valorTemperatura = components.exibirDoubleInput("Conversor de temperaturas");
        }

        switch (temperaturaEscolhida) {
            case ("Celsius para Fahrenheit"):
                resultado = conversor.converterCelsiusFahrenheit(valorTemperatura);
                components.exibirResultado(resultado, " ºF");
                break;
            case ("Celsius para Kelvin"):
                resultado = conversor.converterCelsiusKelvin(valorTemperatura);
                components.exibirResultado(resultado, " K");
                break;
            case ("Fahrenheit para Celsius"):
                resultado = conversor.converterFahrenheitCelsius(valorTemperatura);
                components.exibirResultado(resultado, " ºC");
                break;
            case ("Kelvin para Celsius"):
                resultado = conversor.converterKelvinCelsius(valorTemperatura);
                components.exibirResultado(resultado, " ºC");
                break;
        }

    }
}
