package org.example;
import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double altura;
        char sexo;

        nome = sc.next();
        idade = sc.nextInt();
        altura = sc.nextDouble();
        sexo = sc.next().charAt(0);

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, " + altura + "m e sou do sexo " + sexo +".");
    }
}