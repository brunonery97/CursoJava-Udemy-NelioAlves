package entities;

import enums.Color;

public class Circulo extends Forma {

    private Double raio;

    public Circulo(){
        super();
    }

    public Circulo(Color color, Double raio) {
        super(color);
        this.raio = raio;
    }

    public Double getraio() {
        return raio;
    }

    public void setraio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
