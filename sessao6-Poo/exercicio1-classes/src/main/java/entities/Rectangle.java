package entities;

public class Rectangle {
    public double base;
    public double altura;

    public double areaRetangulo(){
        return (base * altura);
    }

    public double perimetroRetangulo() {
        return 2 * (base + altura);
    }

    public double diagonalRetangulo() {
        return Math.sqrt((base * base) + (altura * altura));
    }


}
