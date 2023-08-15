public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1551, 15450);
        Cliente henrique = new Cliente();
        // conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        conta.setTitular(henrique);
        henrique.setNome("Henrique");

        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("programador");

        conta.setAgencia(0);

        Conta conta2 = new Conta(1225, 1554);

    }
}
