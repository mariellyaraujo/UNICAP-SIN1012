import java.io.Console;
import java.util.Scanner;

public class Questao4 {

public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int a = s.nextInt();

    for (int i = 0; i < a; i++){
        for (int j = i; j >= 04; j--){
            System.out.print("*");
            
            }
            System.out.print("\n");
    }
}
}