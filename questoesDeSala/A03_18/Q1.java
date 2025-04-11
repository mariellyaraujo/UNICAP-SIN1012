package questoesDeSala.A03_18;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int matriz[][] = new int[2][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}