public class TestaReferencia {
    public static void main(String[] args) {
        // é possível fazer isso, pois a classe Funcionário é mãe da classe Gerente, no entanto, não é possível fazer o contrário, além disso, o objeto perde os métodos e atributos da classe gerente e mantém só as da classe mãe, o que muda entre eles é a referência.
        //Funcionario henrique = new Gerente();
        Gerente henrique = new Gerente();
        henrique.setNome("Henrique");
        henrique.setSalario(5000.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registrarBonificacao(henrique);

        System.out.println(controleBonificacao.getSoma());

    }
}
