package entities;

import enums.Color;

public class Retangulo extends Forma {

    private Double altura;
    private Double base;

    public Retangulo(){
        super();
    }

    public Retangulo(Color color, Double altura, Double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBasebase() {
        return base;
    }

    public void setLargura(Double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
