import java.io.Console;
import java.util.Scanner;

public class Questao2 {

public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();

    if (a == b && b == c && c == a) {
        System.out.println("equilatero");

    } else if (a == b || b == c || c == a) {
        System.out.println("isosceles");

    } else {
        System.out.println("escaleno");
    }
}

}