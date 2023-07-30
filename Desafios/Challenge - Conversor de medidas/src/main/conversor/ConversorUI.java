package main.conversor;

/**
 * A classe ConversorUI é responsável por criar uma interface interativa que permite ao usuário escolher o tipo de conversão desejada. Com base na opção selecionada, a classe exibe novas interfaces específicas para cada tipo de conversão.
 *
 * @author Henrique Gomes.
 */
public class ConversorUI {
    UIComponents components = new UIComponents();

    /**
     * O construtor ConversorUI é responsável por exibir um menu interativo no qual o usuário pode selecionar o tipo de conversão que deseja realizar. A partir dessa escolha, o construtor retorna a interface do conversor correspondente.
     */
    public ConversorUI(){
        String conversorChoose = components.exibirOpcoes("Menu", new Object[] {"Conversor de moedas", "Conversor de temperaturas"});

        if (conversorChoose.equals("Conversor de moedas")) {
            getMoneyConversor();
        } else {
            getTemperatureConversor(); // Colocar a tela de temperaturas
        }
    }

    /**
     * O método getMoneyConversor retorna uma instância da classe MoneyConversor. Ao chamar esse método, o construtor da classe MoneyConversor é executado automaticamente, criando as interfaces do conversor de moedas.
     */
    public void getMoneyConversor() {
        new MoneyConversor();
    }

    /**
     * O método getTemperaturConversor retorna uma instância da classe TemperatureConversor. Ao chamar esse método, o construtor da classe TemperatureConversor é executado automaticamente, criando as interfaces do conversor de temperaturas.
     */
    public void getTemperatureConversor() {
        new TemperatureConversor();
    }
}
