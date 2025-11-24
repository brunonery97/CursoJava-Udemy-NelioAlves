package org.example;

import entities.AluguelCarro;
import entities.Carro;
import services.ImpostoBrasil;
import services.ServicoAluguel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Dados do Aluguel:");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), sdf);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), sdf);

        AluguelCarro car1 = new AluguelCarro(retirada, retorno, new Carro(modelo));

        System.out.print("Entre com o preço por hora: ");
        double precoHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoDia = sc.nextDouble();
        System.out.println();

        ServicoAluguel servicoAluguel = new ServicoAluguel(precoDia, precoHora, new ImpostoBrasil());

        servicoAluguel.processoFatura(car1);

        System.out.println("Fatura:");
        System.out.println("Pagamento Básico: " + car1.getFatura().getPagamentoBasico());
        System.out.println("Imposto: " + car1.getFatura().getImposto());
        System.out.println("Pagamento Total: " + car1.getFatura().pagamentoTotal());



    }
}