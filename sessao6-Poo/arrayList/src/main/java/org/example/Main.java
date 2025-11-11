package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList <String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Bruno");
        list.add("Gabriela");
        list.add("Rita");
        list.add("Bernardo");
        list.add(2, "Marco");

        System.out.println(list.size());
        for (String i : list ){
            System.out.println(i);
        }

        System.out.println("----------------");
        System.out.println("REMOVENDO A ANNA DA LISTA");
        list.remove("Anna");
        System.out.println(list.size());
        for (String i : list ){
            System.out.println(i);
        }

        System.out.println("----------------");
        System.out.println("REMOVENDO TODO NOME QUE COMEÇA COM 'M' ");
        list.removeIf(i -> i.charAt(0) == 'M');
        System.out.println(list.size());
        for (String i : list ){
            System.out.println(i);
        }

        System.out.println("----------------");
        System.out.println("IMPRIMINDO A POSIÇÃO DO BOB E MARCO");
        System.out.println("Posição do Bob: " + list.indexOf("Bob"));
        System.out.println("Posição do Marco: " + list.indexOf("Marco"));

        System.out.println("----------------");
        System.out.println("CRIANDO UMA NOVA LISTA SÓ COM OS NOMES QUE COMEÇAM COM B");
        List<String> result = list.stream().filter( x -> x.charAt(0) == 'B').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------------");
        System.out.println("IMPRIMINDO O PRIMEIRO NOME COM A LETRA 'B' ");
        String nome = list.stream().filter( x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(nome);

        System.out.println("----------------");
        System.out.println("IMPRIMINDO O PRIMEIRO NOME COM A LETRA 'J' ");
        String nome2 = list.stream().filter( x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome2);
        System.out.println("CASO ELE NÃO ENCONTRE A DEMANDA, ELE IMPRIMIRA O VALOR NULL");


    }
}