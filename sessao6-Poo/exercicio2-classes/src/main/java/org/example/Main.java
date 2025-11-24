package org.example;
import entities.Employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("DADOS DO FUNCIONARIO:");
        System.out.print("Nome: ");
        employee.nome = sc.nextLine();
        System.out.print("Salário Bruto: ");
        employee.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + employee);

        System.out.println();
        System.out.print("Qual pocentagem para aumentar no salario? ");
        double porcentagem = sc.nextDouble();
        employee.aumentoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizado: " + employee);

        sc.close();;

    }
}