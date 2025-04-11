package questoesDeSala.A04_08;
import java.util.Scanner;
public class Fracao {
    public static double fac(double n){
        if (n == 1){
            return 1;
        } else {
            return (1 / n) + fac(n-1);
        }


    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fac(n));

        s.close();
    }
}