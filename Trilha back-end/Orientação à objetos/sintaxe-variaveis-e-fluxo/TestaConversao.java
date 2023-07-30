public class TestaConversao {

    public static void main (String[] args) {
        double salario = 1250.70;
        // operação de casting para fazer o compilador a entender o double como um int
        int valor = (int) salario;
        System.out.println(valor);

        long numeroGrande = 321245643345L;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
