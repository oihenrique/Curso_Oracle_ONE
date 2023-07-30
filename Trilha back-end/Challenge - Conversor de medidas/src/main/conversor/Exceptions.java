package main.conversor;

import main.util.UtilMethods;

public class Exceptions extends Exception {
    UtilMethods util = new UtilMethods();
    UIComponents components = new UIComponents();

    public void InvalidArgumentException(Object valor) {
        util.verificarDoubleInput(valor);
        components.exibirMensagemErro("Valor inválido, digite apenas números.");
    }
}
