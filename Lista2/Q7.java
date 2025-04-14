package Lista2;

public class Q7 {
    public static double[] totalPorProduto(double[][] vendas){
        double[] totalProduto = new double[3];

        for(int i = 0; i < vendas.length; i++){
            for(int j = 0; j < vendas[i].length; j++){
                totalProduto[i] += vendas[i][j];
            }
        }

        return totalProduto;
    }
    public static double[] totalPorTrimestre(double[][] vendas){
        double[] totalTrimestre = new double[3];

        for(int i = 0; i < vendas.length; i++){
            for(int j = 0; j < vendas[i].length; j++){
                totalTrimestre[j] += vendas[j][i];
            }
        }

        return totalTrimestre;
    }
    public static void pintVetor(double[] x){
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args){
        double[][] vendas = {
            {100.00, 120.0, 130.0, 140.0},
            {80.0, 90.0, 100.0, 110.0},
            {200.0, 210.0, 220.0, 230.0}
        };

    }
}
