public class Cliente implements Autenticavel {

    private AutenticavelUtil autenticador;

    public Cliente() {
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
