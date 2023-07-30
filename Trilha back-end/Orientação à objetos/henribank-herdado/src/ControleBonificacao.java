public class ControleBonificacao {

    private double soma;

    // esse método serve para todos os objetos que herdarem a classe funcionário
    public void registrarBonificacao(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
