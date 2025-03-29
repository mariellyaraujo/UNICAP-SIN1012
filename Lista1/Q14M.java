///////////// QUESTÃO 1 - MATRIZES
package Lista1;
import java.util.Scanner;
public class Q14M {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int quant = 0;
        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o numero da posição " + i + ", " + j);
                matriz[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > 10){
                    quant = quant + 1;
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(quant + " Valores acima de 10");
        s.close();
    }
}
