package org.example;
import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* exercicio video 202 - Curso Udemy Nelio Alves
Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv
Em seguida mostrar o preço medio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos que possuem preço inferior ao preço médio.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\bruni\\OneDrive\\Documentos\\CursosProgramacaoAtual\\Udemy\\Java\\sessao14-ProgramacaoFuncionaleExpressoesLambda\\ExercicioFixacao\\formulario.txt";

        System.out.print("Caminho do arquivo:");
        System.out.println(path);
        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(", ");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double media = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size();
            System.out.print("Preço medio dos Produtos: " + String.format("%.2f",media));
            System.out.println();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < media)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);



        } catch (IOException e){
            System.out.println("Erro " + e.getMessage());
        }



        sc.close();
    }
}