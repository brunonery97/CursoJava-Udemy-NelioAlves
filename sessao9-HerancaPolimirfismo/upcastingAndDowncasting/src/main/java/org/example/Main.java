package org.example;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta cont = new Conta(6745, "Bruno", 0.0);
        ContaEmpresa contaEmpresa = new ContaEmpresa(8817, "Gabriela", 0.0, 500.0);

        // UP CASTING
        Conta cont1 = contaEmpresa;
        Conta cont2 = new ContaEmpresa(9332, "Carol", 0.0, 200.0);
        Conta cont3 = new ContaPoupanca(8825, "Raiane", 0.0, 0.01);

        // DOWNCASTING
        ContaEmpresa cont4 = (ContaEmpresa) cont2; // Aqui forçamos a ContaEmpresa aceitar uma conta
        cont4.emprestimo(100.0);


        // ContaEmpresa cont5 = (ContaEmpresa) cont3;
        // Isso não pode fazer, pois estamos tentando Converter uma contaEmpresa em uma contaPoupanca(cont3)
        // Para evitar esse erro, podemos Verificar antes

        if (cont3 instanceof ContaEmpresa){
            ContaEmpresa cont5 = (ContaEmpresa) cont3;
            cont5.emprestimo(200.0);
            System.out.println("Empréstimo Feito!");
        }
        if (cont3 instanceof ContaPoupanca){
            ContaPoupanca cont5 = (ContaPoupanca) cont3;
            cont5.atualizarSaldo();
            System.out.println("Saldo Atualizado!");
        }






    }
}