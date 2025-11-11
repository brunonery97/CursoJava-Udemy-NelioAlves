package org.example;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*
            Fazer um programa para ler os dados de N
            produtos (N fornecido pelo usuário). Ao final,
            mostrar a etiqueta de preço de cada produto na
            mesma ordem em que foram digitados.
            Todo produto possui nome e preço. Produtos
            importados possuem uma taxa de alfândega, e
            produtos usados possuem data de fabricação.
            Estes dados específicos devem ser
            acrescentados na etiqueta de preço conforme
            exemplo (próxima página). Para produtos
            importados, a taxa e alfândega deve ser
            acrescentada ao preço final do produto.
         */

        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.print("Quantos produtos serão informados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Dados do produto #" + i);
            System.out.print("Produto comum, importado ou usado (c/i/u) ? ");
            char resposta = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (resposta == 'i' || resposta == 'I'){
                System.out.print("Valor da Taxa: ");
                double taxa = sc.nextDouble();
                Produto prod = new ProdutoImportado(nome, preco, taxa);
                list.add(prod);
            }
            else if (resposta == 'u' || resposta == 'U') {
                System.out.print("Data da Fabricação (DD/MM/YYYY): ");
                sc.nextLine();
                String data = sc.nextLine();
                Produto prod = new ProdutoUsado(nome, preco, data);
                list.add(prod);
            }
            else {
                Produto prod = new Produto(nome, preco);
                list.add(prod);
            }
        }
        System.out.println();

        System.out.println("Etiquetas de preços:");
        for (Produto prod: list){
            System.out.println(prod.etiquetaPreco());
        }



        sc.close();

    }
}