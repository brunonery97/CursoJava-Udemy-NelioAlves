package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "3211111111");

        cookies.remove("email");
        cookies.put("phone", "3222222222");

        System.out.println("Contains 'phone' Key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Size: " + cookies.size());

        System.out.println();
        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}