public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoHenrique = new Conta();
        contaDoHenrique.saldo = 4000;
        contaDoHenrique.depositar(500);

        System.out.println(contaDoHenrique.saldo);

        contaDoHenrique.sacar(1000);
        System.out.println(contaDoHenrique.saldo);

        Conta contaDaSabrina = new Conta();
        contaDaSabrina.depositar(1000);

        contaDoHenrique.transferir(100, contaDaSabrina);
        System.out.println(contaDaSabrina.saldo);

        contaDoHenrique.titular = "Henrique Gomes";
        System.out.println(contaDoHenrique.titular);
    }
}
