package org.example;

import entities.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler os dados de uma conta bancária e depois realizar um
        saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
        ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
        saque da conta. Implemente a conta bancária conforme projeto abaixo:
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da Conta: ");
        System.out.print("Numero: ");
        int numConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Titular: ");
        String titular = sc.nextLine();

        System.out.print("Saldo Inicial: ");
        double saldo = sc.nextDouble();

        System.out.print("Limite de Saque: ");
        double limiteSaque = sc.nextDouble();

        Conta cont = new Conta(numConta, titular, saldo, limiteSaque);

        System.out.println();
        System.out.print("Qual o valor do Saque: ");
        double valorSaque = sc.nextDouble();;

        try {
            cont.saque(valorSaque);
            System.out.println("Saldo Atualziado: " + cont.getSaldo());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}