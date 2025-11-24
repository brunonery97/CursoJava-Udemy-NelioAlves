package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na tela a altura
        média de pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
        pessoas caso houver.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vet = new Pessoa[n];

        for (int i = 0; i < vet.length; i++){
            System.out.println("Dados da "+ (i + 1) +"ª pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vet[i] = new Pessoa(nome, idade, altura);
        }

        System.out.println();
        double soma = 0.0;
        System.out.print("ALTURA MÉDIA DAS PESSOAS: ");
        for (int i = 0; i < vet.length; i++){
            soma += vet[i].getAltura();
        }

        double media = soma / vet.length;
        System.out.printf("%.2f %n", media);

        double cont = 0;
        for (int i = 0; i < vet.length; i++){
            if (vet[i].getIdade() < 16){
                cont++;
            }
        }

        double porcentagem;
        porcentagem = (cont / vet.length) * 100;
        System.out.printf("A porcentagem de pessoas com idade menor que 16 anos é %.1f%% %n", porcentagem);

        for (int i = 0; i < vet.length; i++){
            if ( vet[i].getIdade() < 16){
                System.out.println(vet[i].getNome());
            }
        }

    }
}