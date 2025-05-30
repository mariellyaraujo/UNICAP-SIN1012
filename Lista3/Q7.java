package Lista3;
import java.util.Scanner;
public class Q7 {
    public static int[] preencheVetor(int n, Scanner s){
        int[] v = new int[n];
        for(int i = 0; i < v.length; i++) v[i] = s.nextInt();
        return v;
    }

    public static int[] bubbleSortDesc(int[] v, int n){
        boolean trocado;

        for (int i = 0; i < n - 1; i++) {
            trocado = false;
            for (int j = 0; j < n - i - 1; j++) {
                
                if (v[j] < v[j + 1]) {
                    
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocado = true;
                }
            }
            if (!trocado) break;
        }
        return v;
    }

    public static void printVetor (int[] v){
        for(int i = 0; i < v.length; i++) System.out.print(v[i] + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] v = preencheVetor(n, s);
        v = bubbleSortDesc(v, n);

        System.out.print("Avaliacoes ordenadas: ");
        printVetor(v);
        System.out.println();

        System.out.println("Melhor avaliacao: " + v[0]);
        System.out.println("Pior avaliacao: " + v[v.length-1]);
    }
}
