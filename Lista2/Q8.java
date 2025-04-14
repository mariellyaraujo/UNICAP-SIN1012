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
}
