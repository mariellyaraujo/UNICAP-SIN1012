package Lista2;

public class Q10 {
    public static int[][] criarMapa(int[][] mapa){
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                mapa[i][j] = 0;
            }
        }

        mapa[2][2] = 1;
        mapa[5][5] = 1;
        mapa[0][0] = 1;
        mapa[9][9] = 9;

        return mapa;
    }

    public static int contarInimigos(int[][] mapa){
        int count = 0;
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                if(mapa[i][j] == 1) count++;
            }
        }
        return count;
    }

    public static boolean haInimigoNaDiagonal(int[][] mapa){
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                if(i == j && mapa[i][j] == 1) return true;
            }
        }
        return false;
    }

    public static int[] posicaoDoChefe(int[][] mapa){
        int[] posicao = new int[2];
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                if(mapa[i][j] == 9) {
                    posicao[0] = i;
                    posicao[1] = j;
                }
            }
        }
        return posicao;
    }

    public static void main(String[] args) {
        int[][] mapa = new int[10][10];

        mapa = criarMapa(mapa);

        int[] posicaoC = posicaoDoChefe(mapa);

        System.out.println("quantidade de inimigos = " + contarInimigos(mapa));
        System.out.println("há inimigos na diagonal? = " + haInimigoNaDiagonal(mapa));
        System.out.print("posição do chefe = ");
        for(int i = 0; i < posicaoC.length; i++){
            System.out.print(posicaoC[i] + " ");
        }
    }
}
