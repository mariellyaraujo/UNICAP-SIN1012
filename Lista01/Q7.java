package Lista01;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        
        for (int i = a - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        s.close();
    }
    
}
