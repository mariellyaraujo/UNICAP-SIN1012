package Lista2;

public class Q3 {
    public static double media(double[] temps){
        double soma = 0;

        for(int i = 0; i < temps.length; i++){
            soma += temps[i];
        }

        return soma / temps.length;
    }

    public static int diasAcimaMedia(double[] temps){
        int count = 0;
        double media = media(temps);

        for(int i = 0; i < temps.length; i++){
            if(temps[i] > media) count++;
        }

        return count;
    }

    public static double menorTemperatura(double[] temps){
        double menor = temps[0];
        for(int i = 0; i < temps.length; i++){
            if(temps[i] < menor) menor = temps[i];
        }
        return menor;
    }

    public static void main(String[] args){
        double[] temps = {30.5, 32.0, 29.0, 28.5, 31.0, 27.5, 33.0};

        System.out.printf("media: %.2f", media(temps));
        System.out.println("\ndias acima da media: " + diasAcimaMedia(temps));
        System.out.println("menor temperatura: " + menorTemperatura(temps));
    }
}
