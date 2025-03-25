package Lista1;

public class Q18M {
    public static void main(String[] args) {
        int[][] mat = new int[10][10];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i < j){
                    mat[i][j] = ((2 * i) + (7 * j)) - 2;
                } else if(i == j){
                    mat[i][j] = (3 * (i * i)) - 1;
                } else if(i > j){
                    mat[i][j] = (4 * (i * i * i)) - (5 * (j * j)) + 1;
                }

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
