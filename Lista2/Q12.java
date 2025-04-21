package Lista2;

public class Q12 {
    public static String decimalParaBinario(int n){
        if(n==0) return "0";
        if(n==1) return "1";
        return decimalParaBinario((n / 2) + (n % 2));
    }

    public static void main(String[] args){
        int n = 13;

        String binario = decimalParaBinario(n);
        String result = binario.isEmpty() ? "0" : binario;

        System.out.println(result);
    }
}
