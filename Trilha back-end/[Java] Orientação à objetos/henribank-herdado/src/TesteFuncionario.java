public class TesteFuncionario {

    public static void main (String[] args) {
        EditorDeVideo will = new EditorDeVideo();

        will.setNome("Will");
        will.setCpf("222.222.222-22");
        will.setSalario(1350.00);
        System.out.println(will.getBonificacao());
    }
}
