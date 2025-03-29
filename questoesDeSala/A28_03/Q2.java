package questoesDeSala.A28_03;
import java.util.Scanner;
public class Q2 {
    
    public static void lerMatriz(double[][] m, Scanner s){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j <m[i].length; j++){
                m[i][j] = s.nextDouble();
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
