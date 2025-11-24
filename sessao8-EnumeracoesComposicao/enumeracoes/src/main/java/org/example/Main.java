package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

    Pedido pedido = new Pedido(6745, new Date(), PedidoStatus.AGUARDANDO_PAGEMNTO);

        System.out.println(pedido);

        PedidoStatus os1 = PedidoStatus.ENTREGUE;
        PedidoStatus os2 = PedidoStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);


    }
}