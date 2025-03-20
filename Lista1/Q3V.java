package Lista1;

import java.util.Scanner;
public class Q3V {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vet[] = new int[10];

        for(int i = 0; i < vet.length; i++){
            vet[i] = s.nextInt();
        }

        
        for(int i = 0; i < vet.length; i++){
            
            if(vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }

        s.close();
    }
}
