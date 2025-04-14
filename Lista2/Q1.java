package Lista2;

public class Q1 {
    public static double[] reajustarPrecos (double[] x, double n){
        for(int i = 0; i < x.length; i ++){
            x[i] += ((x[i] * n) / 100);
        }

        return x;
    }

    public static void main(String[] args){

        double[] x = {100.00, 20.00, 30.00, 140.00, 70.00, 90.00, 110.00, 28.00, 35.00, 80.00};

        double percent = 10.00;

        double[] numsPorcent = reajustarPrecos(x, percent);

        for(int i = 0; i < numsPorcent.length; i++){
            System.out.print(numsPorcent[i] + " ");
        }
   
    
    }
}
