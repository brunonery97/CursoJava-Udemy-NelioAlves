package org.example;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
    Exerciico desafio Aula 170 - Curso Udemy
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();


        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, n);

        System.out.println();
        System.out.println("Parcelas: ");
        for (Installment installment: obj.getInstallments()) {
            System.out.println(installment);
        }



    }
}