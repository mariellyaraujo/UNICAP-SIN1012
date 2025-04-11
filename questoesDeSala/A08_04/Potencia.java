package questoesDeSala.A08_04;

import java.util.Scanner;

public class Potencia {
    public static int pot(int x, int n){
        if (n == 0){
            return 1;
        } else if (n == 1){
            return x;
        } else {
            return x * pot(x, n-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int n = s.nextInt();

        System.out.println(pot(x, n));

        s.close();
    }
}