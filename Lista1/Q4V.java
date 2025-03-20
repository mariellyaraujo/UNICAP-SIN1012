package Lista1;

import java.util.Scanner;

public class Q4V {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] nomes = new String[15];

        for(int i = 0; i < nomes.length; i++){
            nomes[i] = s.nextLine();
        }

        for(int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}
