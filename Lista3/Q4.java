package Lista3;
import java.util.Scanner;
public class Q4 {

    public static String[][] preencheMatriz(int l, int c, Scanner s){
        String[][] m = new String[l][c+1];
        //preenche os generos
        for(int i = 0; i < m.length; i++){
            m[i][0] = s.nextLine();
        }
        //prenche os titulos
        for(int i = 0; i < m.length; i++){
            for(int j = 1; j < m[i].length; j++){
                m[i][j] = s.nextLine();
            }
        }

        return m;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int c = s.nextInt();
    }
}
