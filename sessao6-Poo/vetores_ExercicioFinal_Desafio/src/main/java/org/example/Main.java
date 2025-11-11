package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados
            pelos números de 0 a 9.

            Faça um programa que inicie todos os dez quartos vazios, e depois leia a quantidade N representando o
            número de estudantes que vão alugar quartos ( N pode ser de 1 a 10). Em seguida, registre o aluguel dos
            N estudantes. Para cada registro, informar o nome, email e o numero do quarto que ele escolheu. Suponha
            que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relátorio de todas ocupações
            do pensionato, por ondem de quarto.
         */

        Scanner sc = new Scanner(System.in);
        Aluguel[] vet = new Aluguel[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numQuarto = sc.nextInt();
            vet[numQuarto] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("QUARTOS OCUPADOS:");
        for (int i = 0; i < vet.length; i++){
            if (vet[i] != null){
                System.out.println( i + ": " + vet[i]);
            }
        }

        sc.close();
    }
}