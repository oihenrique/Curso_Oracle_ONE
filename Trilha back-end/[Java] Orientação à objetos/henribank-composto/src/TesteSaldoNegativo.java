public class TesteSaldoNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(100);
        System.out.println(conta.sacar(101));

        // Código não compila porque deixamos o atributo "saldo" privado
        //System.out.println(conta.saldo);

        System.out.println(conta.getSaldo());
    }
}
