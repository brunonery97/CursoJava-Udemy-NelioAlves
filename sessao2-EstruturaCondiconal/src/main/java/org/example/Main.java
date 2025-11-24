package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;

        System.out.println("Informe um número: ");
        num1 = sc.nextInt();
        if (num1 % 2 == 0){
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitafo é impar.");
        }



    }
}