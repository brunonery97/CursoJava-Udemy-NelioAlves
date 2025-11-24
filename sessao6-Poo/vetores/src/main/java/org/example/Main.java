package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* fazer um programa para ler um número inteiro N e a altura de N pessoas.
        Armazene as N alturas em um vetor. Em seguida, mostrat a altura média dessas pessoas.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de altura:  ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Informe a altura: ");
            vect [i] = sc.nextDouble();
        }

        double soma = 0.0;
        for ( int i = 0; i < n; i++){
            soma += vect[i];
        }

        double media = soma / n;
        System.out.printf("A média das alturas é %.2f", media);

        sc.close();
    }
}