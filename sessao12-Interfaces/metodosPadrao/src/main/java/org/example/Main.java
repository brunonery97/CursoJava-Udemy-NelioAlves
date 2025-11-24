package org.example;

import service.BrazilInterestService;
import service.InterestService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dados do empréstimo: ");
        System.out.print("Valor: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Pagamento após " + months + " meses:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}