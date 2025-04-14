package Lista2;

public class Q3 {
    public static double media(double[] temps){
        double soma = 0;

        for(int i = 0; i < temps.length; i++){
            soma += temps[i];
        }

        return soma / temps.length;
    }
}
