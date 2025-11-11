package application;
import entities.Conta;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Insira o número da Conta: ");
        int numero = sc.nextInt();

        System.out.print("Insira o nome completo do titular: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Tem deposito inicial? ");
        char resposta = sc.next().charAt(0);
        if ( resposta == 'S' || resposta == 's'){
            System.out.print("Qual valor do deposito inicial? ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta (nome, numero, depositoInicial);
        } else {
            conta = new Conta (nome, numero);
        }

        System.out.println();
        System.out.println("DADOS DA CONTA");
        System.out.println(conta);
        System.out.println();

        System.out.print("Qual valor do deposito? ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("DADOS DA CONTA ATUALIZADO");
        System.out.println(conta);
        System.out.println();

        System.out.print("Qual o valor do saque?");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("DADOS DA CONTA ATUALIZADO");
        System.out.println(conta);
        System.out.println();


        sc.close();
    }
}