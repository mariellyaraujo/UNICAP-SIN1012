package Lista01;

import java.util.Random;

    public class Q2 {
        public static void main(String[] args){
            int[] numeros = new int[20];
            Random aleatorio = new Random();

            for(int i = 0; i < numeros.length; i++){
                numeros[i] = aleatorio.nextInt(100) + 1;
            }

            for(int i = 0; i < numeros.length; i++){
                System.out.printf("Número: %d | Sucessor: %d%n", numeros[i], numeros[i] + 1);
            }
        }
    }