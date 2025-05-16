package Lista3;
import java.util.Scanner;

public class Q1 {
        public static int[] preencheVetor(int n, Scanner s){
            int[] v = new int[n];
            for(int i = 0; i < n; i++){
                v[i] = s.nextInt();
            }
            return v;
        }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int busca = s.nextInt();

        int n = s.nextInt();

        int[] v = preencheVetor(n, s);

        
    }
}
