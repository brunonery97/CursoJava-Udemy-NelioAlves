package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da matriz: ");
        int n = sc.nextInt();;

        int [][] mat = new int[n][n];

        for ( int i = 0; i < mat.length; i++){
            for ( int j = 0; j < mat[i].length; j++){
                System.out.print("Informe o valor: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz");
        for ( int i = 0; i < mat.length; i++){
            for ( int j = 0; j <mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("NÚMEROS NEGATIVOS");
        int cont = 0;
        for ( int i = 0; i < mat.length; i++){
            for ( int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    cont++;
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("A quantidade de números negativos é: " + cont);

        System.out.println();
        System.out.println("DIAGONAL PRINCIPAL");
        for ( int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
            }

        sc.close();
        }
}