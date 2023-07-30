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
    public double exibirDoubleInput(String title){

        return Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja converter", title, JOptionPane.QUESTION_MESSAGE));
    }

    /**
     * O método exibirResultado retorna uma janela com uma mensagem de resultado com um valor numérico passado como parâmetro.
     *
     * @param resultado valor que será exibido na mensagem de resultado.
     */
    public void exibirResultado(double resultado, String unidade){
        JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", resultado) + unidade, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Exibe uma interface interativa para verificar se o usuário deseja continuar a utilizar o programa.
     *
     * @return true se "sim", false se "não".
     */
    public boolean exibirConfirmacaoSaida(){
        int escolha = Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "Deseja continuar?", "Menu", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"sim", "não"},"")));

        if (escolha == 1) {
            exibirMensagemSaida();
        }

        return escolha == 0;
    }

    /**
     * Exibe uma janela com uma mensagem de erro.
     *
     * @param errorText mensagem de erro exibida na janela.
     */
    public void exibirMensagemErro(String errorText) {
        JOptionPane.showMessageDialog(null, errorText, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Exibe uma janela com uma mensagem indicativa de finalização do programa.
     */
    public void exibirMensagemSaida(){
        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Conversor", JOptionPane.INFORMATION_MESSAGE);
    }
}
