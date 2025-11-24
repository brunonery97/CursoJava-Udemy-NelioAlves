package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicioFinalDoTopico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        */

        int num1, num2, soma;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " = " +soma);

        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
        */

        double raio;
        double pi = 3.14159;
        raio = sc.nextDouble();
        double area = pi * Math.pow(raio,2);

        System.out.printf("A area do circulo cujo o raio é %.2f é igual a %.4f%n",raio, area);

        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        */


        int a, b, c, d, diferenca;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("A diferença é = " +diferenca);

        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        */

        double codPeca1, codPeca2;
        double quantPeca1, quantPeca2;
        double valorPeca1, valorPeca2;
        double valorTotal;

        codPeca1 = sc.nextDouble();
        quantPeca1 = sc.nextDouble();
        valorPeca1 = sc.nextDouble();

        codPeca2 = sc.nextDouble();
        quantPeca2 = sc.nextDouble();
        valorPeca2 = sc.nextDouble();

        valorTotal = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);

        System.out.printf("Valor a pagar: %.2f%n", valorTotal);

        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
         */

        double A, B, C;
        double pii = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double areaTrianguloRetangulo = (A * C) / 2;
        double areaCirculo = pii * C * C;
        double areaTrapezio = ((A + B) * C)/2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.println(" Area do triangulo Retangulo: " + areaTrianguloRetangulo);
        System.out.println(" Area do circulo: " + areaCirculo);
        System.out.println(" Area do trapezio: " + areaTrapezio );
        System.out.println(" Area do quadrado: " + areaQuadrado);
        System.out.println(" Area do retangulo: " + areaRetangulo);

    }
}
