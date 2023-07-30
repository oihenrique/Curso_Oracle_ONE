package main.conversor;

public class Main {

    public static void main(String[] args) {

        UIComponents components = new UIComponents();
        boolean repeat = true;

        while (repeat) {
            try {
                ConversorUI ui = new ConversorUI();
                repeat = components.exibirConfirmacaoSaida();
            } catch (NullPointerException exception) {
                repeat = components.exibirConfirmacaoSaida();
            }
        }
    }
}
