package entities;

import java.util.Date;

public class HoraContrato {

    private Date data;
    private Double valorHora;
    private Integer quantHora;

    public HoraContrato(){
    }

    public HoraContrato(Date data, Double valorHora, Integer quantHora) {
        this.data = data;
        this.valorHora = valorHora;
        this.quantHora = quantHora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQuantHora() {
        return quantHora;
    }

    public void setQuantHora(Integer quantHora) {
        this.quantHora = quantHora;
    }

    public double valorTotal (){
        return quantHora * valorHora;

    }


}
