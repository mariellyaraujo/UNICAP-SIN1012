package Lista0;

import java.util.Scanner;

public class Q4 {

    public static int verifBissexto(int a, int diaMax) {
        if (a % 4 == 0) {
            if(a % 100 == 0) {

                if(a % 400 == 0) {
                    diaMax = 29;
                } else {
                    diaMax = 28;
                }
            } else {
                diaMax = 29;
            }

        } else {
            diaMax = 28;
        }

        return diaMax;
    }

    public static void main(String[] args) {
        int dia, mes, ano, diaMax = 0;
        
        Scanner s = new Scanner(System.in);

        dia = s.nextInt();
        mes = s.nextInt();
        ano = s.nextInt();

        verifBissexto(ano, diaMax);

        System.out.println(diaMax);
    }
}