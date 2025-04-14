package Lista2;

public class Q13 {
    public static int potencia(int x, int n){
        if(n == 0) {
            return 1;
        } else {
            return x * potencia(x, n-1);
        }
    }
    public static void main(String[] args) {
        int x = 5, n = 2;

        System.out.println(potencia(x, n));
    }
}
