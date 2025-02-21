package Lista0;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if(a >= 2 && a <= 20) {

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
    
            for (int i = a - 1; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        } else {
            System.out.println("Escreva um número entre 2 e 20");
        }

        s.close();

    }
}