package org.example;

import java.util.Scanner;

public class For_Exercicio1 {
    public static void main (String[] args){

        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        X, se for o caso.
         */
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Informe um numero: ");
        valor = sc.nextInt();

        for (int i = 0; i <= valor; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
