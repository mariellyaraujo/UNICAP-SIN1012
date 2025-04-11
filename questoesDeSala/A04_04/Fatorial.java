package questoesDeSala.A04_04;
import java.util.Scanner;
public class Fatorial {
    public static int fat(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n*fat(n-1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println(fat(n));

        s.close();
    }
}