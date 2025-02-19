package Lista0;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ano = s.nextInt();
        int intervalo = s.nextInt();

        for(int i = 0; i < 3; i++) {

            if (ano <= 0) {
                System.out.println("Digite um periodo maior que zero!");

            } else {
                
                ano = ano + intervalo;
                System.out.println(ano);
            }
        }
        
    }
}
