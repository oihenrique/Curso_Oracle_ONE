package br.com.henribank.banco.Test;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5]; // valor default = 0
        int[] refs = {1,2,3,4,5}; // forma literal de declaração


        for(int i = 0; i < idades.length; i++){
           idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }


        idades[0] = 19;

        int idade1 = idades[0];


        System.out.println(idade1);

    }
}
