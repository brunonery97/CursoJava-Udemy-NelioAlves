package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-10-20");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-20T01:30:26");
        Instant d06 = Instant.parse("2025-10-20T01:30:26Z");

        // esse comando transforma para o fuso horário do computador
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r2 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());

        // esse comando transforma para o fuso horário de algum lugar especifico
        LocalDate r3 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));


        System.out.println("Fuso horário de Londres = " + d06);
        System.out.println();

        System.out.println("Data Fuso do computador = " + r1);
        System.out.println("Data e hora Fuso do computador = " + r2);
        System.out.println();

        System.out.println("Data Fuso do Portugal = " + r3);
        System.out.println("Data e hora Fuso do Portugal = " + r4);


        System.out.println("--------------");
        System.out.println("DADOS SEPARADOS");
        System.out.println(" Dia = " + d04.getDayOfMonth());
        System.out.println(" Mês = " + d04.getMonthValue());
        System.out.println(" Ano = " + d04.getYear());
        System.out.println(" Hora = " + d05.getHour());
        System.out.println(" Minutos = " + d05.getMinute());
    }
}