package org.example;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.0));

        // foi criado uma classe para fazer esse aumento de 10% em cada produto
        // list.forEach(new PriceUpdate());

        // também podemos fazer dessa forma sem criar classes que é mais direto chamada de Expressão LAMBDA inline
        double porcentagemAumento = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice() * porcentagemAumento));

        list.forEach(System.out::println);

    }
}