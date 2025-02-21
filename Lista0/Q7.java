package Lista0;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a >= 1 && a <= 20) {

            for (int i = 0; i < a; i++){
                for (int j = 0; j < a; j++){
                    System.out.print("*");
                    
                    }
                    System.out.print("\n");
            }

        } else {
            System.out.print("Escreva um número entre 1 e 20");
        }

        s.close();
    }
}