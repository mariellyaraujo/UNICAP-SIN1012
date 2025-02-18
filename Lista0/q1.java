package Lista0;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int y = s.nextInt();

        if (y <= 0) {
            System.out.println("Min Volume");

        } else if (y > 0 && y <= 25) {
            System.out.println("Low Volume");

        } else if (y > 25 && y <= 75) {
            System.out.println("Medium Volume");
            
        } else if (y > 75 && y < 100) {
            System.out.println("High Volume");
            
        } else if (y >= 100) {
            System.out.println("Max Volume");
            
        }
    } 
}
