public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaSabrina = new Conta();
        contaDaSabrina.titular = new Cliente();
        contaDaSabrina.titular.nome = "Sabrina Gomes";
        contaDaSabrina.titular.profissao = "Farmaceutica";

        System.out.println(contaDaSabrina.titular.nome);
        System.out.println(contaDaSabrina.titular.profissao);
    }
}
