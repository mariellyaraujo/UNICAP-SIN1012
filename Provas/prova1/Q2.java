package Provas.prova1;

public class Q2 {
    public static void printMatriz (int[][] x){
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
