package Lista1;
import java.util.Scanner;
public class Q8V {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tamanho = 10, acount = 0, bcount= 0;

        int[] a = new int[tamanho];
        int[] b = new int[tamanho];
        int[] c = new int[tamanho*2];

        System.out.println("Preencha os valores do primeiro vetor:");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        System.out.println("Preencha os valores do segundo vetor:");
        for(int i = 0; i < a.length; i++){
            b[i] = s.nextInt();
        }

        for(int i = 0; i < c.length; i++){
            if(i % 2 == 0){
                c[i] = a[acount];
                acount += 1;
            } else {
                c[i] = b[bcount];
                bcount += 1;
            }
        }
    
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }    

    }
}
