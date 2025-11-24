package org.example;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println("----------------------");

        // transformando data em texto

        //primeira forma
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d02.format(fmt01));
        //mesma coisa que a primeira, porem instancia direto sem criar variavel
        System.out.println(d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d02.format(fmt02));

        /*
        Nesse exemplo iremos converter a hora usando o padrão de londres
        Primeiro colocamos um certo horário com o fuso de londres chamando de d04. Depois usamos o formato 3 em cima
        do horário de londres. Onde podemos observar que o dia mudou quando foi aplicado o fuso atual do computador
        que é SP.
        */

        Instant d04 = Instant.parse("2025-10-20T01:30:26Z");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(fmt3.format(d04));


    }
}