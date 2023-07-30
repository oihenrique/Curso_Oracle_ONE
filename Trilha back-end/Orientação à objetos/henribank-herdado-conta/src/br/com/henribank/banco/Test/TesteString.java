package br.com.henribank.banco.Test;

public class TesteString {
    public static void main(String[] args) {

        int a = 3;
        String nome = "Henrique"; // object literal
        String vazio = "";
        String espacial = "    espaço    ";
        /*
         String nome = new String("Henrique");
         String outra = nome.toLowerCase();
        */

        char hazao = 'H';
        char hazinho = 'h';


        String outra = nome.replace(hazao, hazinho);

        System.out.println(nome);
        System.out.println(outra);

        char c = nome.charAt(2);
        System.out.println(c);

        int pos = nome.indexOf("ri"); // retorna onde começa a string passada
        System.out.println(pos);

        String sub = nome.substring(3);
        System.out.println(sub);

        System.out.println(nome.length());

        System.out.println(vazio.isEmpty());
        System.out.println(espacial.trim()); // remove espaços
        System.out.println(nome.contains("en")); // verifica se a string passada está dentro da outra string

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);
    }
}
