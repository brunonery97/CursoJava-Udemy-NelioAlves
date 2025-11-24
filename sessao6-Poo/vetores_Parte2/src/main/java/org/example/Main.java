package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler um número inteiro N e os dados ( nome e preço) de N produtos.
        Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de Produtos: ");
        int n = sc.nextInt();

        Produto[] vet = new Produto[n];

        for ( int i = 0; i < vet.length; i++){
            System.out.print("Informe o nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Informe o preço do produto: ");
            double preco = sc.nextDouble();
            vet[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < vet.length; i++){
            soma += vet[i].getPreco();
        }

        double media = soma / vet.length;
        System.out.printf("A média dos preços é %.2f", media);
    }
}