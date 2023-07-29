package main.conversor;


import main.util.CotacaoMoedas;

import javax.swing.*;
import java.awt.*;

public class ConversorUI extends JFrame {
    public ConversorUI() {
        String res = JOptionPane.showInputDialog(null, "Selecione uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de medidas", "Conversor de temperatura"},"").toString();

        if (res.equals("Conversor de medidas")) {
            moneyConversorWindow();
        } else {
            temperatureConversorWindow();
        }
    }

    public void moneyConversorWindow() {
        double resultado;

        ConversorDeMedidas conversor = new ConversorDeMedidas();
        CotacaoMoedas cotacao = new CotacaoMoedas();

        double moedaParaConverter = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja converter"));

        String[] opcoes = {"Real para dólar", "Real para Euro", "Real para Libras Esterlinas", "Real para Peso Argentino", "Real para Peso Chileno", "Dólar para Real", "Euro para Real", "Peso Argentino para Real", "Peso Chileno para Real"};

        String res = JOptionPane.showInputDialog(null, "Selecione uma opção", "Conversor de moeda", JOptionPane.PLAIN_MESSAGE, null, opcoes,"").toString();

        switch (res) {
            case "Real para dólar":
                conversor.converterDeRealPara(moedaParaConverter, cotacao.getDolar());
                break;
            case "Real para Euro":
                conversor.converterDeRealPara(moedaParaConverter, cotacao.getEuro());
                break;
            case "Real para Libras Esterlinas":
                conversor.converterDeRealPara(moedaParaConverter, cotacao.getLibraEsterlina());
                break;
            case "Real para Peso Argentino":
                conversor.converterDeRealPara(moedaParaConverter, cotacao.getPesoArgentino());
                break;
            case "Real para Peso Chileno":
                conversor.converterDeRealPara(moedaParaConverter, cotacao.getPesoChileno());
                break;
            case "Dólar para Real":
                conversor.converterParaReal(moedaParaConverter, cotacao.getDolar());
                break;
            case "Euro para Real":
                conversor.converterParaReal(moedaParaConverter, cotacao.getEuro());
                break;
            case "Euro para Libras Esterlinas":
                conversor.converterParaReal(moedaParaConverter, cotacao.getLibraEsterlina());
                break;
            case "Peso Argentino para Real":
                conversor.converterParaReal(moedaParaConverter, cotacao.getPesoArgentino());
                break;
            case "Peso Chileno para Real":
                conversor.converterParaReal(moedaParaConverter, cotacao.getPesoChileno());
                break;
            default:
                // adicionar tratamento de exceção
                break;
        }
    }

    public void temperatureConversorWindow () {
        setTitle("Conversor de temperaturas");
        setSize(380, 280);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xEEEEEE));

        setVisible(true);
    }
}
