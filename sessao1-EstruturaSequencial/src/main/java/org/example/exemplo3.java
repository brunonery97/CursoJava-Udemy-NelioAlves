package org.example;

public class exemplo3 {
    public static void main(String[] args) {
        /*
            variavel "A" recebe a raiz quadrada de "X"
            A = Math.sqrt(x);

            varialvel "A" recebe o resultado de "X" elevado a "Y"
            A = Math.pow(x, y);

            variavel "A" recebe o valor absoluto de "X"
            A = Math.abs(x);
         */

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + b);
        System.out.println("Raiz quadrada de 25.0 = " + c);

        a = Math.pow (x, y);
        b = Math.pow (x, 2);
        c = Math.pow(5.0, 2.0);

        System.out.println( x + " elevado a " + y + " = " + a);
        System.out.println( x + " elevado ao quadrado = " + b);
        System.out.println("5.0 elevado ao quadrado = " + c);

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("O valor absoluto de " + y + " = " + a );
        System.out.println("O valor absoluto de " + z + " = " + b );


    }
}
