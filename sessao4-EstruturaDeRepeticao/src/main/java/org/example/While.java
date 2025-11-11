package org.example;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int soma = 0;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        while (num != 0){
            soma += num;
            System.out.print("Digite outro número: ");
            num = sc.nextInt();
    }
        System.out.println("A soma dos números digitados é: " + soma);
    }
}