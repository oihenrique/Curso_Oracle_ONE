package main.conversor;

import javax.swing.*;

public class ConversorDeMedidas {

    public void converterDeRealPara(double valor, double moedaConversao){
        double resultado = valor / moedaConversao;
        JOptionPane.showMessageDialog(null, "Resultado: $ " + String.format("%.2f", resultado), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public void converterParaReal(double valor, double moedaConversao){
        double resultado = valor * moedaConversao;
        JOptionPane.showMessageDialog(null, "Resultado: $ " + String.format("%.2f", resultado), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

}
