public class criarConta {

    public static void main (String[] args) {
        // new Conta(); // instanciado o objeto dentro do main, nesse caso ele só cria o objeto na memória.
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);
    }
}
