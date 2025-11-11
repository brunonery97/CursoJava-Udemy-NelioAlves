package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler un número inteiro N e depois os dados (id, nome e salario) de N funcionários. Não
        deve haver repetção de id.

        Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa
        deve ler um id e o valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
        mostrar a listagem atualizada dos funcionários.
         */

        Scanner sc = new Scanner(System.in);
        ArrayList <Funcionario> list = new ArrayList<>();

        System.out.print("Informe quantos Funcionarios serão registrado: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Funcioanrio " + (i + 1 ) + ":" );

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();


            System.out.print("ID: ");
            Integer id = sc.nextInt();

            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Funcionario func = new Funcionario(nome, id, salario);
            list.add(func);
        }

        System.out.println();
        System.out.print("Insira o ID do funcionário que receberá aumento: ");
        int idFuncionario = sc.nextInt();

        Funcionario func = list.stream().filter( x -> x.getId() == idFuncionario). findFirst().orElse(null);

        if (func == null){
            System.out.println("Esse ID não existe! ");
        } else {
            System.out.print("Informe a porcentagem do aumento: ");
            double porcentagemAumento = sc.nextDouble();
            func.aumentoSalario (porcentagemAumento);
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario i : list){
            System.out.println(i);
        }

    }
}