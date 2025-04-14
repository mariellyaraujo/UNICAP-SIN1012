package Lista2;

public class Q11 {
    public static int fatorial(int n){
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(fatorial(n));
    }
}
