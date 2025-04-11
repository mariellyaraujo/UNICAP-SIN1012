package questoesDeSala.A04_04;

import java.util.Scanner;

public class Soma {
    public static int soma(int n){
        if (n == 0) {
            return 0;
        } else {
            return n + soma(n-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(soma(n));

        s.close();     
    }
}
