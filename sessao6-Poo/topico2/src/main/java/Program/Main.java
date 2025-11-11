package Program;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("DADOS DO PRODUTO");
        System.out.print("Nome: " );
        product.name = sc.nextLine();

        System.out.print("Valor: " );
        product.price = sc.nextDouble();

        System.out.print("Quantidade: " );
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("DADOS DO PRODUTO: " + product);

        System.out.println();
        System.out.print("Informe a quantidade para ser adicionado no estoque: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("DADOS DO PRODUTO ATUALIZADO: " + product);

        System.out.println();
        System.out.print("Informe a quantidade para remover do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("DADOS DO PRODUTO ATUALIZADO: " + product);


        sc.close();
    }
}