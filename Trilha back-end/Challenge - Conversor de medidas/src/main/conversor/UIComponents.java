package main.conversor;

import javax.swing.JOptionPane;

/**
 * A classe UIComponents contém métodos que representam componentes de uma interface.
 *
 * @author Henrique Gomes
 */
public class UIComponents {

    /**
     * O método exbirOpcoes retorna uma interface interativa com uma lista encadeada com as opções disponíveis para o usuário escolher.
     *
     * @param title: título da janela;
     * @param options: lista com opções;
     * @return interface interativa contendo as opções de escolha para o usuário.
     */
    public String exibirOpcoes(String title, Object[] options){

        return JOptionPane.showInputDialog(null, "Selecione uma opção", title, JOptionPane.PLAIN_MESSAGE, null, options,"").toString();
    }

    /**
     * O método exibirDoubleinput retorna uma interface interativa com um input e retorna um valor digitado pelo usuário.
     * @return double valor.
     */
    public double exibirDoubleInput(){

        return Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja converter"));
    }

    /**
     * O método exibirResultado retorna uma janela com uma mensagem de resultado com um valor numérico passado como parâmetro.
     *
     * @param resultado valor que será exibido na mensagem de resultado.
     */
    public void exibirResultado(double resultado){
        JOptionPane.showMessageDialog(null, "Resultado: $ " + String.format("%.2f", resultado), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Exibe uma interface interativa para verificar se o usuário deseja continuar a utilizar o programa.
     *
     * @return true se "sim", false se "não".
     */
    public boolean exibirConfirmacaoSaida(){
        Integer escolha = Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "Deseja continuar?", "Menu", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"sim", "não"},"")));

        return escolha == 0;
    }
}
