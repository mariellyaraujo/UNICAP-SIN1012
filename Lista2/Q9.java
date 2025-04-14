package Lista2;

public class Q9 {
    public static int[] vitoriasPorTime(int[][] resultados){
        int[] vitorias = {0, 0, 0, 0};

        for(int i = 0; i < resultados.length; i++){
            for(int j = 0; j < resultados[i].length; j++){
                if(resultados[i][j] == 1) vitorias[i]++;
            }
        }
        return vitorias;
    }
}
