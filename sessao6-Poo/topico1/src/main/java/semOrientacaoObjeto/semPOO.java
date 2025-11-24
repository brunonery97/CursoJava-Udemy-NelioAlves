package semOrientacaoObjeto;

import java.util.Scanner;

public class semPOO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.print("Insira os lados do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.print("Insira os lados do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt( p * (p - xA) * (p - xB) * (p - xC));

        double p2 = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt( p2 * (p2 - yA) * (p2 - yB) * (p2 - yC));

        System.out.printf("Area do triangulo X = %.2f%n ", areaX);
        System.out.printf("Area do triangulo Y = %.2f%n ", areaY);

        if (areaX > areaY){
            System.out.println("A maior area é do triagunlo X.");
        } else {
            System.out.println("A maior area é do triagunlo y.");
        }

    }
}