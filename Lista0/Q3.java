package Lista0;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

    double delta, x1, x2;
    Scanner s = new Scanner(System.in);

    double A = s.nextDouble();
    double B = s.nextDouble();
    double C = s.nextDouble();

    if (A != 0) {

        delta = (B * B) - (4 * A * C);

        if (delta > 0) {
            ///duas raizes
            
            x1 = ((B * -1) + Math.sqrt(delta)) / (2 * A);

            x2 = ((B * +1) - Math.sqrt(delta)) / (2 * A);

            System.out.println("As raizes sao" + x1 + "e" + x2);


        } else if (delta == 0) {
            ///uma raiz / x1 = x2
            x1 = 666;
            System.out.println("A unica raiz eh" + x1);

        } else {
            System.out.println("Nao ha raizes.");

        }

    } else {
        System.out.println("O coeficiente nao pode ser zero!");
    }

    }
}