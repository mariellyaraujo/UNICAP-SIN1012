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

            count++;
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println(i + ": " + numeros[i]);
        }

        System.out.println("Que numero gostaria de buscar?");
        int m = s.nextInt();

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == m){
                System.out.println("Numero: " + numeros[i]);
                System.out.println("Indice: " + i);
                break;
            } else if (i == numeros.length - 1){
                System.out.println("Numero nao encontrado");
            }
        }
    }
}
