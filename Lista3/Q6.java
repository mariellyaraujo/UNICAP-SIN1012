package Lista3;
import java.util.Scanner;
public class Q6 {
    public static double[] preencheVetor(double[] v, Scanner s){
        for(int i = 0; i < v.length; i++) v[i] = s.nextDouble();
        return v;
    }

    public static double[] selectionSort(double[] v){
        int i, j, min;
        double aux;

        for(i = 0; i < v.length - 1; i++){
            min = 1;
            for(j = i+1; j < v.length; j++){
                if(v[j] < v[min]){
                    min = j;
                }           
            }
            if(v[i] != v[min]){
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
        return v;
    }
    public static void printVetor(double[] v){
        for(int i = 0; i < v.length; i++) System.out.print(v[i] + " ");
    }
    public static void sortLivros(Scanner s, int num){
        int n = s.nextInt();

        double[] v = new double[n];

        preencheVetor(v, s);
        selectionSort(v);

        System.out.print("Precos ordenados da secao" + num + ": ");
        printVetor(v);

        System.out.println();

        System.out.println("Mais barato da secao " + num + ": " + v[0]);
        System.out.println("Mais caro da secao " + num + ": " + v[v.length]);

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
    }
}
