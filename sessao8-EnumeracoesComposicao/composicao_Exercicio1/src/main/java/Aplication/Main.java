package Aplication;
import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
       Ler os dados de um trbaljador com N contratos (N fornecido pelo usuario). Depois, solicitar do usuario um mês e
       mostrar qual foi o salário do funcionario nesse mês. Exercicio do Video número 123.
 */

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();

        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();

        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador),
                salarioBase, new Departamento(nomeDepartamento));
        System.out.println();
        System.out.print("Quantos contratos tem esse trabalhador? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Dados do #"+ i + " contrato: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contratoData = sdf.parse(sc.next());

            System.out.print("Valor da hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.print("Quantidade de horas: ");
            int duracao = sc.nextInt();
            System.out.println();

            HoraContrato contrato = new HoraContrato(contratoData, valorPorHora, duracao);
            trabalhador.addContrato(contrato);
        }

        System.out.print("Insira o mês e o ano para calcular a renda (DD/yyyy): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0,2));
        int ano = Integer.parseInt(mesAno.substring(3));

        System.out.println("Name: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("No mês " + mes + "/" +ano+ " o trabalhador recebeu R$" + String.format("%.2f", trabalhador.renda(mes, ano)));




        sc.close();
    }
}