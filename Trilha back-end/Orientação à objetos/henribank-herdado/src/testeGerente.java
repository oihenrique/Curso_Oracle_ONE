public class testeGerente {
    public static void main (String[] args) {
        Gerente jean = new Gerente();
        jean.setNome("jean");
        jean.setCpf("333.333.333-33");
        jean.setSalario(5000.00);

        System.out.println(jean.getNome());
        System.out.println(jean.getCpf());
        System.out.println(jean.getSalario());
        System.out.println(jean.getBonificacao());

        System.out.println(jean.autenticar(2222));
    }
}
