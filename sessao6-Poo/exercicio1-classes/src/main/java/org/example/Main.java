package org.example;
import entities.Rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("DADOS DO RETANGULO: ");
        System.out.println("Informe a altura e a base do retangulo: ");
        rectangle.altura = sc.nextDouble();
        rectangle.base = sc.nextDouble();

        System.out.println();
        System.out.println("Area do retangulo " + rectangle.areaRetangulo());
        System.out.println("Perimetro do retangulo " + rectangle.perimetroRetangulo());
        System.out.println("Diagonal do retangulo " + rectangle.diagonalRetangulo());

        sc.close();

    }
}