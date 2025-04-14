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

    public static void main(String[] args){
        double[] notas = {6.5, 8.5, 2.0, 5.0, 10.0};
        double limite = 7.0;

        System.out.println("Quantidade de notas acima do limite: " + contarNotasAcima(notas, limite));
    }
}
