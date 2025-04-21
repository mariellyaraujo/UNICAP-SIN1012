package Lista2;

public class Q12 {
    public static String decimalParaBinario(int n){
        if(n==0) return "";
        return decimalParaBinario((n / 2) + (n % 2));
    }
}
