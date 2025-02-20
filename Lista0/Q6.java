package Lista0;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int soma = 0, quant = -1, a;
        
        while(soma <= 18) {
            a = s.nextInt();
            soma = soma + a;
            quant++;
      
          }
      
          System.out.print(quant);
          
    }
}