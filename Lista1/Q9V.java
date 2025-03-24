package Lista1;

public class Q9V {
    public static void main(String[] args){
        int x = 0, count = 0;

        int[] v = new int[100];

        while(x < 100){
            if(count % 7 != 0 || count % 10 == 7 && count != 7){
                v[x] = count;
                x = x + 1;
            }
            count = count + 1;
        }

        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }
    }
}
