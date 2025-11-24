package application;

import model.entities.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
        de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
        dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
        novamente a reserva com os dados atualizados. O programa não deve aceitar dados
        inválidos para a reserva, conforme as seguintes regras:
        - Alterações de reserva só podem ocorrer para datas futuras
        - A data de saída deve ser maior que a data de entrada
         */

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int numeroQuarto = sc.nextInt();

            System.out.print("Data do Check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data do Check-out (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(numeroQuarto, checkIn, checkout);
            System.out.println("Reserva: " + reservation);

            System.out.println();
            System.out.println("Insira as datas para atualizar a reserva:");
            System.out.print("Data do Check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data do Check-out (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.atualizarDatas(checkIn, checkout);
            System.out.println("Reserva: " + reservation);
        }
        catch ( ParseException e){
            System.out.println("Formato de data inválido");
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado.");
        } catch (Exception e){
            System.out.println("Erro na reserva: " + e.getMessage());
        }


        sc.close();

    }
}