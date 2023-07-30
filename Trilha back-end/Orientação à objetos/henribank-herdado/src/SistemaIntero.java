public class SistemaIntero {

    private  int senha = 2222;

    public void autenticar(Autenticavel gerente) {
        boolean autenticado = gerente.autenticar(this.senha);
        if (autenticado) {
            System.out.println("Login efetuado com sucesso");
        } else {
            System.out.println("Falha na autenticação");
        }
    }
}
