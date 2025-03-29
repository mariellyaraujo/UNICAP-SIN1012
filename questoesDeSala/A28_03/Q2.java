package questoesDeSala.A28_03;
import java.util.Scanner;
public class Q2 {

    public static void resultante(int[][] a, int[][] b){
        int[][] result = new int[4][4];

        for(int i = 0; i < result.length; i++){
            for(int j = 0; i < result[i].length; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public static void lerMatriz(double[][] m, Scanner s){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j <m[i].length; j++){
                m[i][j] = s.nextDouble();
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[][] a = new double[4][4];
        double[][] b = new double[4][4];

        lerMatriz(a, s);
    }
}
