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

    public static int timeInvicto (int[][] resultados){
        int[] vitorias = vitoriasPorTime(resultados);

        for(int i = 0; i < vitorias.length; i++){
            if(vitorias[i] == 4) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] resultados = {
            {0, 1, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1},
            {1, 1, 1, 1}
        };

        int[] vitorias = vitoriasPorTime(resultados);

        for(int i = 0; i < vitorias.length; i++){
            System.out.print(vitorias[i] + " ");
        }

        System.out.println("\n" + timeInvicto(resultados));
    }
}
