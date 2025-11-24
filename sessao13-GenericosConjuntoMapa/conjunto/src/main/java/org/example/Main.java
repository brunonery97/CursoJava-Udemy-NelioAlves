package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        // HashSet - não ordena, porem imprimi mais rapido os elementos
        // TreeSet - ordena os itens, porem demora mais

        set.add("Tv");
        set.add("Notebook");
        set.add("Tablet");
        set.add("Computador");
        set.add("Celular");
        set.add("Mouse");
        set.add("Teclado");
        set.add("Relogio");

        set.remove("Tablet");
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set){
            System.out.println(p);
        }
    }
}