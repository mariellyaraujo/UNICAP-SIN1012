package Lista2;

public class Q13 {
    public static int potencia(int x, int n){
        if(n == 0 | n == 1) {
            return 1;
        } else {
            return x * potencia(x, n-1);
        }
    }
}
