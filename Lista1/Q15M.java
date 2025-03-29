///////////// QUESTÃO 2 - MATRIZES
package Lista1;

public class Q15M {
    public static void main(String[] args){
        int[][] mat = new int[5][5];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(i == j){
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
