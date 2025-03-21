package Lista1;

public class Q7V {
   public static void main(String[] args) {
    int acount = 0;
    int bcount = 0;
    int[] a = {5, 3, 2, 8, 0, 12, 89, 67, 9, 87, 21, 34, 56, 3, 0, 5, 2, 6, 1, 9};

    int[] b = {-5, -3, -2, -8, 0, -12, -89, -67, -9, -87, -21, -34, -56, -3, 0, -5, -2, -6, -1, -9};

    int[] c = new int[40];

    for(int i = 0; i < c.length; i++){
        if(i % 2 == 0){
            c[i] = a[acount];
            acount += 1;
        } else {
            c[i] = b[bcount];
            bcount += 1;
        }
    }

    for(int i = 0; i < c.length; i++){
        System.out.print(c[i] + " ");
    }

   } 
}
