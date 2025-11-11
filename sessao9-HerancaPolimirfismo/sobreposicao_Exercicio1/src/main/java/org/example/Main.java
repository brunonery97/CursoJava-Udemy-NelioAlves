package org.example;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Uma empresa possui funcionários próprios e terceirizados.
            Para cada funcionário, deseja-se registrar nome, horas
            trabalhadas e valor por hora. Funcionários terceirizado
            possuem ainda uma despesa adicional.
            O pagamento dos funcionários corresponde ao valor da hora
            multiplicado pelas horas trabalhadas, sendo que os
            funcionários terceirizados ainda recebem um bônus
            correspondente a 110% de sua despesa adicional.
            Fazer um programa para ler os dados de N funcionários (N
            fornecido pelo usuário) e armazená-los em uma lista. Depois
            de ler todos os dados, mostrar nome e pagamento de cada
            funcionário na mesma ordem em que foram digitados.
         */

        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão informados? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Dados do Funcionário #" + (i+1));
            System.out.print("Esse Funcionário é terceirizado (s/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Quantidade de Horas Trabalhadas: ");
            int horas = sc.nextInt();

            System.out.print("Valor da hora: ");
            double valorHora = sc.nextDouble();

            if (ch == 'S' || ch == 's'){
                System.out.print("Qual o valor da despesa? ");
                double despesa = sc.nextDouble();
                Funcionario func = new FuncionarioTerceirizado(nome, horas,valorHora,despesa);
                list.add(func);
            } else {
                Funcionario func = new Funcionario(nome, horas, valorHora);
                list.add(func);
            }
        }

        System.out.println();

        System.out.println("Pagamentos:");
        for (Funcionario func: list){
            System.out.println(func.getNome() + ", R$ " + func.pagamento());
        }

        sc.close();
    }
}