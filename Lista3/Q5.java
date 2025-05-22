package Lista3;
import java.util.Scanner;
public class Q5 {
    public static int[] insertionSort(int[] v){
        for(int i = 1; i < v.length; i++){
            int chave = v[i];
            int  j = i - 1;

            while(j>= 0 && v[j] > chave){
                v[j+1] = v[j];
                j = j - 1;
            }
            v[j-1] = chave;
        }
        return v;
    }

    public static double Mediana(int[] v){
        double mediana = 0;
        if(v.length % 2 == 0){

        } else {
            mediana = v[(v.length+1)/2];
        }
        return mediana;
    }

    public static void vendasProdutos(Scanner s){
        int n = s.nextInt();

        int[] v = new int[n];
    }
    public static void main(String[] args) {
        
    }
}
