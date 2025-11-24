package org.example;

public class Exemplo {
    public static void main (String[] args){
        double preco = 34.5;
        double desconto;

        if (preco < 20.0){
            desconto = preco * 0.01;

        }else {
            desconto = preco * 0.05;
        }

        /* Comando acima pode ser simplificado da seguinte forma */

        double preco2 = 34.5;
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.01 : preco2 * 0.05;

        System.out.printf("Preço do produto é %.2f%n", desconto);
        System.out.printf("Preço do produto é %.2f%n", desconto2);

        /* se a condição for verdadeira usa a primeira opção, caso contrário usa a segunda opção  */
    }


}