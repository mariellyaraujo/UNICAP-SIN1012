package Lista2;

public class Q14 {
        public static boolean ehPrimo(int n, int divisor){
            if (n < 2) return false;

            if(divisor > Math.sqrt(n)) return true;

            if(n % divisor == 0) return false;

            return ehPrimo(n, divisor + 1)
        }

}
