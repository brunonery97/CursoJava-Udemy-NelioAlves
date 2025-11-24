package org.example;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Forma> list = new ArrayList<>();

        System.out.print("Quantas Formas vão ser inseridas? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Dados da Forma #" + i + ":");
            System.out.print("Retangulo ou Circulo (r/c)? ");
            char res = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (res == 'r'){
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                list.add(new Retangulo(color, altura, largura));
            }
            else {
                System.out.print("Radio: ");
                double radio = sc.nextDouble();
                list.add(new Circulo(color, radio));
            }
        }

        System.out.println();
        System.out.println("Area das Formas:");

        for ( Forma forma : list ){
            System.out.println( String.format("%.2f" ,forma.area()));
        }


        sc.close();
    }
}