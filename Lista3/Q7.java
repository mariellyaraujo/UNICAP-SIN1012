package Lista3;
import java.util.Scanner;
public class Q7 {
    public static int[] preencheVetor(int n, Scanner s){
        int[] v = new int[n];
        for(int i = 0; i < v.length; i++) v[i] = s.nextInt();
        return v;
    }
}
