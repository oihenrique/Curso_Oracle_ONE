public class Administrador extends Funcionario implements Autenticavel {
    @Override
    public double getBonificacao() {
        return 50;
    }

    private AutenticavelUtil autenticador;

    public Administrador() {
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
