package services;

import entities.AluguelCarro;
import entities.Fatura;
import java.time.Duration;

public class ServicoAluguel {

    private double precoDia;
    private double precoHora;
    private Imposto servicoImposto;

    public ServicoAluguel(double precoDia, double precoHora, Imposto servicoImposto) {
        this.precoDia = precoDia;
        this.precoHora = precoHora;
        this.servicoImposto = servicoImposto;
    }

    public double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(double precoDia) {
        this.precoDia = precoDia;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public void processoFatura (AluguelCarro aluguelCarro){

        double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getTermino()).toMinutes();
        double horas = minutos / 60;
        double dia = horas /24;

        double pagamentoBasico;
        if (horas <= 12){
            pagamentoBasico = getPrecoHora() * Math.ceil(horas);
        } else {
            pagamentoBasico = getPrecoDia() * Math.ceil(dia);
        }

        double imposto = servicoImposto.imposto(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura(pagamentoBasico, imposto));
    }
}