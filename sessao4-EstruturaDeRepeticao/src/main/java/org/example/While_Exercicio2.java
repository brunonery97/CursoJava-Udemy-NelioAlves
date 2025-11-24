package org.example;

import java.util.Scanner;

public class While_Exercicio2 {
    public static void main(String[] args){

        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.
         */

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int voto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu voto: ");
        voto = sc.nextInt();

        while (voto != 4){
            if (voto == 1){
                alcool++;
            }
            else if ( voto == 2) {
                gasolina ++;
            }
            else if ( voto == 3) {
                diesel ++;
            }
            System.out.println("Informe um novo voto: ");
            voto = sc.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Votos no Alcool: " + alcool);
        System.out.println("Votos na Gasolina: " + gasolina);
        System.out.println("Votos no Diesel: " + diesel);
    }
}
