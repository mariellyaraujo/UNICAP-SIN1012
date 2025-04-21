package Lista2;

public class Q14 {
        public static boolean ehPrimo(int n, int divisor){
            if (n < 2) return false;

            if(divisor > Math.sqrt(n)) return true;

            if(n % divisor == 0) return false;

            return ehPrimo(n, divisor + 1);
        }

        public static void main(String[] args){
            int n = 17;
            int d = 2;

            System.out.println(ehPrimo(n, d));
        }

}
