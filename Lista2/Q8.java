package Lista2;

public class Q8 {
    public static int pontoMaisAlto(int[][] mapa){
        int maior = 0;

        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                if(mapa[i][j] > maior) maior = mapa[i][j];
            }
        }

        return maior;
    }

    public static double mediaAltitude(int[][] mapa){
        double soma = 0;
        int count = 0;
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa[i].length; j++){
                soma += mapa[i][j];
                count++;
            }
        }
        return soma / count;
    }

    public static boolean ehPlanalto(int[][] mapa){
        int countIgual = 0, count = 0;

        for(int i = 0; i < mapa.length - 1; i++){
            for(int j = 0; j < mapa[i].length - 1; j++){
                if(mapa[i][j] == mapa[i+1][j+1]) countIgual++;
                count++;
            }
        }

        if(countIgual==count){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[][] mapa = {
            {10, 12, 14, 11, 13},
            {9, 11, 12, 10, 13},
            {10, 10, 13, 14, 15},
            {11, 13, 13, 12, 13},
            {12, 14, 15, 13, 10}
        };

        System.out.println("ponto mais alto = " + pontoMaisAlto(mapa));
        System.out.println("media = " + mediaAltitude(mapa));
        System.out.println("eh planalto? = " + ehPlanalto(mapa));
    }
}
