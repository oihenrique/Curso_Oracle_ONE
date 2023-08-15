public class TestaPontoFlutuante {

    public static void main(String[] args) {
        double salario;
        salario = 1250.70;

        System.out.println("Meu salario é: " + salario);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        // divisão de números inteiros resulta num resultado inteiro
        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao);

        // é preciso definir o número com o ponto, pois se não ele interpreta como se fosse divisão de inteiros, mesmo com o double.
        double novaDivisao = 5.0 / 2;
        System.out.println(novaDivisao);
    }
}
