package entities;

public class Carro {

    private String modelo;

    public Carro(){
    }

    public Carro(String model) {
        this.modelo = model;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
