package Provas.prova1;

public class Q1 {
    public static void printVetor(int[] x){
        for(int i = 0; i < x.length; i++) System.out.println(x[i] + "");
    }

    public static void soma(int[] x){
        int soma = 0;
        for(int i = 0; i < x.length; i++) soma += x[i];

        System.out.println(soma);
    }
    
    public static void main(String[] arg){
        int[] vetor = {1, 2, 3, 4, 5,6,7,8,9,10}; 
    }
}
