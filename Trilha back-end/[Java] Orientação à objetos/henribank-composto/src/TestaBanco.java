public class TestaBanco {
    public static void main(String[] args) {
        Cliente henrique = new Cliente();
        henrique.nome = "Henrique Gomes";
        henrique.cpf = "222.222.222-22";
        henrique.profissao = "programador";

        Conta contaDoHenrique = new Conta();
        contaDoHenrique.depositar(1000);

        contaDoHenrique.titular = henrique;
        System.out.println(contaDoHenrique.titular.nome);
    }
}
