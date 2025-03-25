package Lista1;

public class Q16M {
    public static void main(String[] args){
        int[][] mat = new int[4][4];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = i * j;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
