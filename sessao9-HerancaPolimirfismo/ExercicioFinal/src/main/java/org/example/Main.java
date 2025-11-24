package org.example;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Exercicio video 139 - curso Java Nélio Alvez -Udemy
         */

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Insira o número de contribuinte: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Dados do contribuinte #" + i);
            System.out.print("Pessoa Fisica ou Juridica (F/J)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();

            if (ch == 'f' || ch == 'F') {
                System.out.print("Despesas com saúde: ");
                double despesaSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, despesaSaude));
            } else {
                System.out.print("Número de funcionários: ");
                int quantFuncionario = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, quantFuncionario));
            }
        }
        System.out.println();
        System.out.println("Impostos pagos:");

        for (Pessoa pessoa : list) {
            System.out.println(pessoa.getNome() + ": R$ " + String.format("%.2f", pessoa.imposto()));
        }

        double soma = 0;
        for (Pessoa pessoa : list) {
            soma += pessoa.imposto();
        }

        System.out.println();
        System.out.println("Imposto total: R$ " + String.format("%.2f", soma));

        sc.close();
    }
}
