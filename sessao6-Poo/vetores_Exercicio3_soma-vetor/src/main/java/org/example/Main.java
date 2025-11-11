package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos números serão informados: ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++){
            System.out.print("Informe um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Valores digitados:");
        for (int i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }

        int soma = 0;
        for (int i = 0; i < vet.length; i++){
            soma += vet[i];
        }
        System.out.println("A soma total dos valores é " + soma);

        double media = soma / vet.length;

        System.out.println("A média dos valores é " + media);

        sc.close();
    }
}