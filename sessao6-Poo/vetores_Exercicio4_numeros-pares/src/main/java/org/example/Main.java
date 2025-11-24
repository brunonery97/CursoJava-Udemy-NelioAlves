package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão informados? ");
        int n = sc.nextInt();
        int[] vet = new int[n];

        for(int i = 0; i < vet.length; i++){
            System.out.print("Informe um número: ");
            vet[i] = sc.nextInt();
        }

        int cont = 0;
        System.out.println("NÚMEROS PARES");
        for(int i = 0; i < vet.length; i++){
            if (vet[i] % 2 ==0 ){
                System.out.print(vet[i] + " ");
                cont++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares = " + cont);
    }
}