package Lista3;
import java.util.Scanner;
public class Q3 {
    public static int[]  preencheVetor(int n){
        int[] v = new int[n];
        for(int i = 0; i < n; i++) v[i] = i;
        return v;
    }

    public static void printVetor(int[] v){
        for(int i = 0; i < v.length; i++) System.err.println(v[i]);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int busca = s.nextInt();

        int[] v = preencheVetor(n);
        printVetor(v);

        boolean naoEncontrado = true;
        int inicio = 0;
        int fim = v.length - 1;
        int meio, count = 0;

        
    }
}
