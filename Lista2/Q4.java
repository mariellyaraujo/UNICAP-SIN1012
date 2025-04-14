package Lista2;

public class Q4 {
    public static int contarNotasAcima(double[] n, double limite){
        int count = 0;
        for(int i = 0; i < n.length; i++){
            if(n[i] > limite){
                count++;
            }
        }
        return count;
    }
}
