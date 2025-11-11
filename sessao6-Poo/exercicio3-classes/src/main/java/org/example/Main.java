package org.example;

import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println("NOTA FINAL = " + aluno.resultadoFinal());

        if (aluno.resultadoFinal() < 60.0){
            System.out.println("Aluno Reprovado!");
            System.out.println("Ficou " + aluno.pontosFaltante() + " pontos abaixo da media.");
        } else {
            System.out.println("Aluno Aprovado!");
        }


        sc.close();
    }
}