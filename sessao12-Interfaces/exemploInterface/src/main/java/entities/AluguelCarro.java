package entities;

import java.time.LocalDateTime;

public class AluguelCarro {

    private LocalDateTime inicio;
    private LocalDateTime termino;
    private Carro carro;
    private Fatura fatura;

    public AluguelCarro(){
    }

    public AluguelCarro(LocalDateTime inicio, LocalDateTime termino, Carro carro) {
        this.inicio = inicio;
        this.termino = termino;
        this.carro = carro;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getTermino() {
        return termino;
    }

    public void setTermino(LocalDateTime termino) {
        this.termino = termino;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
