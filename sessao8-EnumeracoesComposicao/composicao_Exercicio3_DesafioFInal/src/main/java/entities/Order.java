package entities;

import Enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private Cliente client;
    private List<OrderItem> items = new ArrayList<OrderItem>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Order(){
    }

    public Order(Date moment, OrderStatus status, Cliente client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem (OrderItem item){
        items.remove(item);
    }

    public double valorTotal() {
        double sum = 0;
        for (OrderItem it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumo do pedido: \n");
        sb.append("Data: " + sdf.format(moment) + "\n");
        sb.append("Status: " + status + " \n");
        sb.append(client + "\n");
        sb.append("Dados dos Itens: \n");
            for (OrderItem item: items){
                sb.append(item + "\n");
            }
        sb.append("Preço total: R$" + valorTotal());
        return sb.toString();

    }


}
