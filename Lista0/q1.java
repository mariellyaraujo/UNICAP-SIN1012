package Lista0;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a <= 0) {
            System.out.println("Min Volume");

        } else if (a > 0 && a <= 25) {
            System.out.println("Low Volume");

        } else if (a > 25 && a <= 75) {
            System.out.println("Medium Volume");
            
        } else if (a > 75 && a < 100) {
            System.out.println("High Volume");
            
        } else if (a >= 100) {
            System.out.println("Max Volume");
            
        }
    } 
}
