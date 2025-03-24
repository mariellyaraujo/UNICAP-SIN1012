package Lista1;
import java.util.Scanner;
public class Q13V {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        int[] v = new int[100];

        v[0] = 1;

        for(int i = 0; i <= n; i++){
            int aux1 = 0, aux2;
            for(int j = 0; j <= i; j++){
                aux2 = aux1 + v[j];
                aux1 = v[j];
                v[j] = aux2;

                System.out.printf(" %3d", v[j]);

            }
            System.out.println();
        }

        s.close();
    }
}
