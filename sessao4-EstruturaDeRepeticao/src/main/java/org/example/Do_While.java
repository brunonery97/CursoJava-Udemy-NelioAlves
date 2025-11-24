package org.example;

import java.util.Scanner;

public class Do_While {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("Informe a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (9 * C) / 5 + 32;
            System.out.println("Equivalente em Fahrenheit: " + F);
            System.out.print("Deseja repetir a operação?");
            resp = sc.next().charAt(0);

        } while (resp != 'n');
        sc.close();
    }
}
