package org.example;

public class ConvMoeda {

    public static double IOF = 0.06;

    public static double valorReais(double valorDollar, double valorComprado){

        return valorDollar * valorComprado * (1.0 + IOF);
    }

}
