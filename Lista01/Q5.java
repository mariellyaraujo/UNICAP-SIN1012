package Lista01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        int count = 0, a;
        Scanner s = new Scanner(System.in);

        System.out.println("Quantos numeros voce quer ler?");
        int n = s.nextInt();

        int[] numeros = new int[n];

        while(count < numeros.length){
            a = s.nextInt();
            numeros[count] = a;
        }

        
    }
}
