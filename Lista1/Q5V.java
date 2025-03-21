package Lista1;

import java.util.Scanner;

public class Q5V {
    public static void main(String[] args){
        int[] a = new int[20];

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }

        System.out.println();

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }

        s.close();
    }
}