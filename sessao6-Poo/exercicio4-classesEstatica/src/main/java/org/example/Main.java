package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do Dollar? ");
        double valorDollar = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double valorComprado = sc.nextDouble();

        System.out.println();
        System.out.println("Valor a ser pago em reais: " + ConvMoeda.valorReais(valorDollar, valorComprado));

        sc.close();
    }
}