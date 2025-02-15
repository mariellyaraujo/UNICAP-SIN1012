import java.io.Console;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    /* ////// questao 1

    for(int i = 0; i < 10; i++){

    int a = s.nextInt();
    
    if(a < 0){
        System.out.println("negativo");

    } else {

        System.out.println("positivo");
    } 
    }
    
    */
    
    ///// questao 2
    /* 
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
    */

    //// questao 3
    
    /* 
    int a = s.nextInt();

    for (int i = 0; i < a; i++){
        for (int j = 0; j < a; j++){
            System.out.print("*");
            
            }
            System.out.print("\n");
    }

    */

    ///// questao 4
    
    /* 
    int a = s.nextInt();

    for (int i = 0; i < a; i++){
        for (int j = i; j >= 04; j--){
            System.out.print("*");
            
            }
            System.out.print("\n");
    }
    */

    ///// questao 5
    
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
