package org.example;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        // O metodo saque foi sobrescrito na classe de poupança, pois uma tem juros e a outra não.

        Conta cont1 = new Conta(6745, "Bruno", 1000.0);

        cont1.saque(100);
        System.out.println(cont1.getSaldo());

        ContaPoupanca cont2 = new ContaPoupanca(8825, "Gabriela", 1000.0, 0.01);
        cont2.saque(100);
        System.out.println(cont2.getSaldo());








    }
}