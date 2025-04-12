package questoesDeSala.A03_28;
import java.util.Scanner;
public class Q2 {

    public static void matrizResultante(double[][] a, double[][] b){
        double[][] resultante = new double[4][4];

        for(int i = 0; i < resultante.length; i++){
            for(int j = 0; j < resultante[i].length; j++){
                resultante[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatriz(resultante);
    }

    public static void lerMatriz(double[][] m, Scanner s){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j <m[i].length; j++){
                m[i][j] = s.nextDouble();
            }
        }
    }

    public static void printMatriz(double[][] v){
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v[i].length; j++){
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[][] a = new double[4][4];
        double[][] b = new double[4][4];

        lerMatriz(a, s);
        lerMatriz(b, s);
        matrizResultante(a, b);

        s.close();
    }
}
