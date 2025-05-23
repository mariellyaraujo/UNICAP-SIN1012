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
            v[j+1] = chave;
        }
        return v;
    }

    public static double Mediana(int[] v){
        double mediana = 0;
        if(v.length % 2 == 0){
            mediana = (v[v.length/2 -1] + v[v.length/2]) / 2;

        } else {
            mediana = v[(v.length)/2];
        }
        return mediana;
    }

    public static int[] preencheVetor(int[] v, Scanner s){
        for(int i = 0; i < v.length;i++) v[i] = s.nextInt();
        return v;
    }

    public static void printVetor(int[] v){
        for(int i = 0; i < v.length; i++) System.out.print(v[i] + " ");
    }

    public static void vendasProdutos(Scanner s, int num){
        int n = s.nextInt();

        int[] v = new int[n];

        v = preencheVetor(v, s);
        v = insertionSort(v);

        System.out.println("Vendas ordenadas do produto " + num + ": ");
        printVetor(v);

        System.out.println("Mediana do produto " + num + ": " + Mediana(v));

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            vendasProdutos(s, i);
        }
    }
}
