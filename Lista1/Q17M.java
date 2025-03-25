package Lista1;
import java.util.Scanner;
public class Q17M {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int iMaior, jMaior, maior = 0;

        int[][] mat = new int[4][4];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("Digite o numero da posição " + i + ", " + j);
                mat[i][j] = s.nextInt();

                if(mat[i][j] > maior){
                    maior = mat[i][j];
                    iMaior = i;
                    jMaior = j;
                }
            }
        }
    }
}
