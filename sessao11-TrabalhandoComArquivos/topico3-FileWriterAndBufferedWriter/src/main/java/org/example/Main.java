package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[] {"Olá Gabriela", "Quantos anos você tem?"};

        String path = "C:\\Users\\bruni\\OneDrive\\Documentos\\CursosProgramacaoAtual\\Udemy\\Java\\sessao11-TrabalhandoComArquivos\\ArquivoCriado.txt.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            // se apagar a parte acima do true, ele cria um arquivo
            // se deixar com o true, ele adiciona os textos no final do arquivo
            for (String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}