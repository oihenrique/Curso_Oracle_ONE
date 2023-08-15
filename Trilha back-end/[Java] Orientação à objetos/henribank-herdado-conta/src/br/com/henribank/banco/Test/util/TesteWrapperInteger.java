package br.com.henribank.banco.Test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        Integer idadeRef = 29; //autoboxinng, é criado um objeto do tipo Integer
        int primitivo = new Integer(21); //unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef);
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0);  //unboxing
        Integer i2 = lista.get(1);

        System.out.println(i1);
        System.out.println(i2);

        System.out.println("--------------------------------");

        Integer valorRef = Integer.valueOf(33);
        int valorPri = valorRef.intValue();

        System.out.println(valorPri);

        System.out.println("---------------- PARSING -----------------");

        Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
        int iParseado2 = Integer.parseInt("44");  //parseando e devolvendo primitivo

        System.out.println(iParseado1);
        System.out.println(iParseado2);

        System.out.println("------------ CONSTANTES DA CLASSE -----------------");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
