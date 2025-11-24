package org.example;

import Enums.OrderStatus;
import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(sc.next());
        sc.nextLine();
        Cliente client = new Cliente(name, email, dataNascimento);

        System.out.println();
        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.print("Quantos itens há nesse pedido? ");
        int n = sc.nextInt();;
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            System.out.println("Dados do #" + i + "Produto: ");
            System.out.print("Nome: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Valor: ");
            double valorProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = sc.nextInt();
            sc.nextLine();
            System.out.println();

            Product product = new Product(nomeProduto, valorProduto);
            OrderItem it = new OrderItem(quantidadeProduto, valorProduto, product);
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order.toString());







        sc.close();
    }
}