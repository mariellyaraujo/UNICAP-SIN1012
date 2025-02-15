import java.io.Console;
import java.util.Scanner;

public class Questao5 {

public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int j, i;
    int a = s.nextInt();

    for ( i = 0; i < a; i++){

        for ( j = 0; j < a; j++){

            if (i == 0 || j == 0 || i == a - 1 || j == a - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

                }
                System.out.print("\n");
        
    }

}
}