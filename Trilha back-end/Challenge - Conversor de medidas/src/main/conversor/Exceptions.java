package main.conversor;

public class Exceptions extends RuntimeException {
    UIComponents components = new UIComponents();

    /**
     * Exibe uma janela com uma mensagem de erro de valor.
     */
    public void InvalidArgumentException() {
        components.exibirMensagemErro("Valor inválido, digite apenas números.");
    }
}
