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

        int inicio = 0;
        int fim = v.length - 1;
        int meio, count = 0, posicao = -1;

        while(inicio <= fim){
            count++;
            meio = (int) ((inicio +  fim) / 2);
            if(v[meio] == busca){
                posicao = meio;
                break;
            } else if (v[meio] < busca){
                inicio = meio + 1;
            } else fim = meio -1;
        }

        System.out.println(posicao + " " + count);
    }
}
