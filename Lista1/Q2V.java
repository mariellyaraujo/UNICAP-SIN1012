package Lista1;

import java.util.Scanner;

public class Q2V {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int vet[] = new int[6];

        for(int i = 0; i < vet.length; i++){
            int a = s.nextInt();
            vet[i] = a;
        }

        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " ");
        }

        s.close();
    }
    
}
