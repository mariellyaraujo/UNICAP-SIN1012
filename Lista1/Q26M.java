///////////// QUESTÃO 13 - MATRIZES
package Lista1;
import java.util.Scanner;
public class Q26M {

    public static void printMatriz (int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " " );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] poltronas = new int[10][10];
        
        for(int i = 0; i < poltronas.length; i++){
            for(int j = 0; j < poltronas[i].length; j++){
                poltronas[i][j] = -1;
            }
        }

        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            int linha = s.nextInt();
            int coluna = s.nextInt();
            
            if(poltronas[linha - 1][coluna - 1] == - 1){
                poltronas[linha - 1][coluna - 1] = 1;
            } else if (poltronas[linha - 1][coluna - 1] == 1){
                System.out.println("Poltrona já foi vendida");
            }
        }

        printMatriz(poltronas);

        s.close();
    }
}
