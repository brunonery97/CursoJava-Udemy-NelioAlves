package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Fazer um prgrama que leia números inteiros positivos N (máximo 10) e depois N números inteiros e
        armazene-os em um vetor. Em seguida mostrar na tela todos os números negativos lidos.
         */

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NÙMEROS NEGATIVOS:");

        for (int i = 0; i < vet.length; i++){
            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }

        sc.close();

    }
}