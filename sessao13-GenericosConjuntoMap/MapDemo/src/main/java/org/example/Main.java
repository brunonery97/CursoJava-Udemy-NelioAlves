package org.example;

import entities.Product;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Product, Double> estock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 900.0);
        Product p3 = new Product("Tablet", 900.0);

        estock.put(p1, 100.0);
        estock.put(p2, 200.0);
        estock.put(p3, 150.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + estock.containsKey(ps));
    }
}