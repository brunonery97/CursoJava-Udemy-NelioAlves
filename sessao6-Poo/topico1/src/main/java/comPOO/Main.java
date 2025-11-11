package comPOO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.print("Insira os lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.print("Insira os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.areaTriangle();
        double areaY = y.areaTriangle();

        System.out.printf("Area do triangulo X = %.2f%n ", areaX);
        System.out.printf("Area do triangulo Y = %.2f%n ", areaY);

        if (areaX > areaY){
            System.out.println("A maior area é do triagunlo X.");
        } else {
            System.out.println("A maior area é do triagunlo y.");
        }

    }
}