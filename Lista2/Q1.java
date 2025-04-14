package Lista2;

public class Q1 {
    public static double[] reajustarPrecos(double[] x, double n){
        for(int i = 0; i < x.length; i ++){
            x[i] += ((x[i] * n) / 100);
        }

        return x;
    }
   
    
}
