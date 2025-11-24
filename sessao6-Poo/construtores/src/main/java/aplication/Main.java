package aplication;
import entities.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("DADOS DO PRODUTO");
        System.out.print("Nome: " );
        String name = sc.nextLine();

        System.out.print("Valor: " );
        double price = sc.nextDouble();

        System.out.print("Quantidade: " );
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("DADOS DO PRODUTO: " + product);

        System.out.println();
        System.out.print("Informe a quantidade para ser adicionado no estoque: ");
        quantity = sc.nextInt();
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