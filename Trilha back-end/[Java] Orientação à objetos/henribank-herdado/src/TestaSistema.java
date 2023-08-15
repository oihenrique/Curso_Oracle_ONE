public class TestaSistema {
    public static void main(String[] args) {
        Gerente henri = new Gerente();
        Administrador sabrina = new Administrador();
        SistemaIntero si = new SistemaIntero();

        henri.setSenha(2222);
        sabrina.setSenha(3333);

        si.autenticar(henri);
        si.autenticar(sabrina);
    }
}
