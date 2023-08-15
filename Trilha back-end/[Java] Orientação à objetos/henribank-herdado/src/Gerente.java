public class Gerente extends Funcionario implements Autenticavel {
    public double getBonificacao() {
        return super.getSalario(); // super indica que salario vem da classe mãe
    }
    private AutenticavelUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticavelUtil();
    }
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }
}
