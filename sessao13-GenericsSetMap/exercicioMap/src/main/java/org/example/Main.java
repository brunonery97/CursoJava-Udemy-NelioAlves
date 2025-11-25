package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votos = new LinkedHashMap<>();
        String path = "C:\\Users\\bruni\\OneDrive\\Documentos\\CursosProgramacaoAtual\\Udemy\\Java\\sessao13-GenericosConjuntoMap\\exercicioMap\\votos.txt";

        System.out.println("Caminho do arquivo:");
        System.out.println(path);

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null){

                String[] filds = line.split(",");
                String nome = filds[0];
                int count = Integer.parseInt(filds[1]);

                if (votos.containsKey(nome)){
                    int totalVotos = votos.get(nome);
                    votos.put(nome, count + totalVotos);
                }
                else{
                    votos.put(nome, count);
                }

                line = br.readLine();
            }

            for (String key : votos.keySet()){
                System.out.println(key + ": " + votos.get(key));
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

        sc.close();
    }
}