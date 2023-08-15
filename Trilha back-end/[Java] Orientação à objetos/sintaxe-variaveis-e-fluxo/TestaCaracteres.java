public class TestaCaracteres {

    public static void main (String[] args) {
        // char grava um caractere unicode, ou seja, ele só tem espaço para 1 caractere e com aspas simples
        char letra = 'a';
        System.out.println(letra);

        // se você usar números, pode acessar a tabela ASCII, por exemplo, 66 corresponde à letra B na tabela ASCII
        char valor = 66;
        System.out.println(valor);

        // Não é possível somar um char com um int, no entanto, se utilizarmos a operação de casting o compilador vai pegar o resultado final da soma e considerar como um número da tabela ASCII
        valor = (char) (valor + 1);
        System.out.println(valor);

        // String é utilizado para conjuntos de caracteres e sua sintaxe é com aspas duplas, String em java nãp [e tipo primitivo, mas uma classe.
        String palavra = "Hello world";
        System.out.println(palavra);
    }

}
