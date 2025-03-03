package Lista01;

import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int count = 0;
        String concatenacao = "", maior = "", ultimaString = "";

        while(true) {
            String a = s.nextLine();
            count++;

            if(a.equals(ultimaString)) {
                System.out.printf("numero de strings escritas: %d", count);
                System.err.printf("concatenacao: %d", concatenacao);
                System.err.printf("maior string: %d", maior);
                break;
            } else {
                concatenacao = concatenacao + a;

                if (a.length() > maior.length()) {
                    maior = a;
                    continue;
                }

                ultimaString = a;
            }


        }

        s.close();
    }
}