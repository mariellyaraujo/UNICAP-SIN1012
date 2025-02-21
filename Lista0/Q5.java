package Lista0;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ano = s.nextInt();
        int intervalo = s.nextInt();

        if (intervalo <= 0 || ano <= 0) {
            System.out.println("Digite um periodo maior que zero!");
            s.close();
            return;
        }

        for(int i = 0; i < 3; i++) {
                ano = ano + intervalo;
                System.out.println(ano);
            }
        s.close();
        
    }
}
