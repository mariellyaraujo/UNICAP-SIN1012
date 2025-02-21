package Lista0;

import java.util.Scanner;

public class Q4 {

    public static void verifBissexto(int a, int[] fev) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    fev[0] = 29;
                } else {
                    fev[0] = 28;
                }
            } else {
                fev[0] = 29;
            }
        } else {
            fev[0] = 28;
        }
    }

    public static void main(String[] args) {
        int dia, mes, ano, diaMax = 0;
        
        Scanner s = new Scanner(System.in);

        dia = s.nextInt();
        mes = s.nextInt();
        ano = s.nextInt();

        int[] fev = new int[1];

        if (mes <= 0 || mes > 12) {
            System.out.println("Data invalida");
            s.close();
            return;

        } 

        if (mes == 2) {
            verifBissexto(ano, fev);

            diaMax = fev[0]; 

        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diaMax = 31;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diaMax = 30;

        }

        if (dia <= 0 || dia > diaMax) {
            System.out.println("Data invalida");
            s.close();
            return;
        }


        switch(mes) {
            case 1:
                System.out.println((dia <=19) ? "Capricornio" : "Aquario");
                break;

            case 2:
                System.out.println((dia <= 18) ? "Aquario" : "Peixes");
                break;

            case 3:
                System.out.println((dia <= 20) ? "Peixes" : "Aries");
                break;

            case 4:
                System.out.println((dia <= 19) ? "Aries" : "Touro");
                break;

            case 5:
                System.out.println((dia <= 20) ? "Touro" : "Gemeos");
                break;
            
            case 6:
                System.out.println((dia <= 21) ? "Gemeos" : "Cancer");
                break;

            case 7:
                System.out.println((dia <= 22) ? "Cancer" : "Leao");
                break;
            
            case 8:
                System.out.println((dia <= 22) ? "Leao" : "Virgem");
                break;

            case 9:
                System.out.println((dia <= 22) ? "Virgem" : "Libra");
                break;
            
            case 10:
                System.out.println((dia <= 22) ? "Libra" : "Escorpiao");
                break;

            case 11:
                System.out.println((dia <= 21) ? "Escorpiao" : "Sagitario");
                break;

            case 12:
                System.out.println((dia <= 21) ? "Sagitario" : "Capricornio");
                break;

        }

         s.close();

    }
}
