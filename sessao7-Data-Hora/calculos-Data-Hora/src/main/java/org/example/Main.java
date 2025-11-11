package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2025-10-20");
        LocalDateTime d02 = LocalDateTime.parse("2025-10-20T01:30:26");
        Instant d03 = Instant.parse("2025-10-20T01:30:26Z");

        LocalDate semanaAnterior = d01.minusDays(7);
        LocalDate  semanaProxima = d01.plusDays(7);
        LocalDate  anoProximo = d01.plusYears(1);

        System.out.println();
        System.out.println("Data atual: " + d01);
        System.out.println("Semana Anterior: " + semanaAnterior);
        System.out.println("Proxima semana: " + semanaProxima);
        System.out.println("Proximo ano: " + anoProximo);
        System.out.println("----------------------------------------------");


        LocalDateTime proximaHora = d02.plusHours(1);
        LocalDateTime anteriorMinuto = d02.minusMinutes(1);

        System.out.println();
        System.out.println("Data atual: " + d02);
        System.out.println("Proxima hora: " + proximaHora);
        System.out.println("Minuto anterior: " + anteriorMinuto);
        System.out.println("----------------------------------------------");


        Instant proximaSemana2 = d03.plus(7, ChronoUnit.DAYS);
        Instant semanaAnterior2 = d03.minus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("Data e hora atual: " + d03);
        System.out.println("Proxima Semana: " + proximaSemana2);
        System.out.println("Semana Anterior: " + semanaAnterior2);
        System.out.println("----------------------------------------------");

        LocalDateTime data1 = LocalDateTime.parse("2025-08-12T10:39:28");
        LocalDateTime data2 = LocalDateTime.parse("2025-11-01T10:39:28");
        System.out.println();
        System.out.println("DURAÇÃO DE UM PERIODO");

        Duration d1 = Duration.between(data1, data2);
        System.out.println("Data Inicio: " + data1);
        System.out.println("Data Fim: " + data2);
        System.out.println("A diferença é de " + d1.toDays() + " dias, ou " + d1.toHours() + " horas, ou " + d1.toMinutes() + " minutos.");




    }

}