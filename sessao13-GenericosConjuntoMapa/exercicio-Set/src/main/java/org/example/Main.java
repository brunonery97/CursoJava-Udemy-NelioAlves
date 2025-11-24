package org.example;

import entities.LogEntry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // exercicio Video 187 - CursoNelioAlves

        String path = "C:\\Users\\bruni\\OneDrive\\Documentos\\CursosProgramacaoAtual\\Udemy\\Java\\sessao13-GenericosConjuntoMapa\\HashCodeAndEquals\\formulario.txt";

        System.out.println("Caminho do arquivo: ");
        System.out.println(path);

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(" ");
                String userName = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(userName, moment));

                line = br.readLine();
            }

            System.out.println("Total de usuarios = " + set.size());

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
