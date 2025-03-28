package Lista1;

import java.util.Scanner;

public class Q11V {

    public static float calcMedia(int[] v){
        float soma = 0;
        for(int i = 0; i < v.length; i++){
            soma += v[i];
        }
        return soma / v.length;
    }

    public static double calcVariancia(int[] v){
        float media = calcMedia(v);
        double soma = 0.0f;
        for(int i = 0; i < v.length; i++){
            soma += Math.pow(v[i], 2);
        }
        double result = (soma / v.length) - Math.pow(media, 2);
        return result;
    }
    public static void calcDesvioPadrao (int[] v){
        double variancia =calcVariancia(v);

        double desvio = Math.sqrt(variancia);

        System.out.printf("O desvio padrão é: %.2f\n", desvio);

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int[] v = new int[10];

        for(int i = 0; i < v.length; i++){
            v[i] = s.nextInt();
        }

        calcMedia(v);
        calcVariancia(v);
        calcDesvioPadrao(v);

        s.close();
    }
}
