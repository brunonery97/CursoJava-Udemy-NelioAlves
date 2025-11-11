package org.example;

public class Main {
    public static void main(String[] args) {

        String[] vet = new String[] {"Maria", "Bob", "Alex"};

        for ( int i = 0; i < vet.length; i++){
            System.out.println(vet[i]);
        }

        System.out.println("---------------------------");

        for (String i : vet){
            System.out.println(i);
        }
    }
}