package org.example;

import java.util.Scanner;

public class For_Exercicio2 {
    public static void main (String[] args){
        /*
        Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
         */

        Scanner sc = new Scanner(System.in);

        int valor;
        int num;
        int in = 0;
        int out = 0;

        System.out.print("Informe um valor: ");
        valor = sc.nextInt();

        for ( int i = 0; i < valor; i++){
            System.out.print("Infome outro valor: ");
            num = sc.nextInt();

            if (num > 9 && num < 21){
                in++;
            } else {
                out++;
            }
        }
        System.out.println("Foram digitados " + in + " dentro do intervalo.");
        System.out.println("Foram digitados " + out + " fora do intervalo.");
    }
}
