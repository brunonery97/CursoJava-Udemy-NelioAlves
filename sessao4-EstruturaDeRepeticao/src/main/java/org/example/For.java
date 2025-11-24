package org.example;

import java.util.Scanner;

public class For {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;
        int num;

        System.out.print("Informe a quantidade de leitura do sistema: ");
        n = sc.nextInt();

        for ( int i = 0; i < n; i++){
            System.out.print("Informe um numero: ");
            num = sc.nextInt();
            soma += num;
        }

        System.out.println("A soma dos números digitador é: " + soma);
    }
}
