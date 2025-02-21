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

        if (mes == 2) {
            verifBissexto(ano, fev);

            diaMax = fev[0]; 

        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diaMax = 31;

        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diaMax = 30;
        }

        
        if (dia > diaMax || dia <= 0) {
            System.out.println("Data invalida");
         } else {
            if (mes == 1) {
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Capricornio");
                } else if (dia >= 20 && dia <= diaMax) {
                    System.out.println("Aquario");
                }
            } else if (mes == 2) {
                if (dia >= 1 && dia <= 18) {
                    System.out.println("Aquario");
                } else if (dia >= 19 && dia <= diaMax) {
                    System.out.println("Peixes");
                }

            } else if (mes == 3) {
                if (dia >= 1 && dia <= 20) {
                    System.out.println("Peixes");
                } else if (dia >= 21 && dia <= diaMax) {
                    System.out.println("Aries");
                }
            } else if (mes == 4) {
                if (dia >= 1 && dia <= 19) {
                    System.out.println("Aries");
                } else if (dia >= 20 && dia <= diaMax) {
                    System.out.println("Touro");
                }
            } else if (mes == 5) {
                if (dia >= 1 && dia <= 20) {
                    System.out.println("Touro");
                } else if (dia >= 21 && dia <= diaMax) {
                    System.out.println("Gemeos");
                }
            } else if (mes == 6) {
                if (dia >= 1 && dia <= 21) {
                    System.out.println("Gemeos");
                } else if (dia >= 22 && dia <= diaMax) {
                    System.out.println("Cancer");
                }
            } else if (mes == 7) {
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Cancer");
                } else if (dia >= 23 && dia <= diaMax) {
                    System.out.println("Leao");
                }
            } else if (mes == 8) {
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Leao");
                } else if (dia >= 23 && dia <= diaMax) {
                    System.out.println("Virgem");
                }
            } else if (mes == 9) {
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Virgem");
                } else if (dia >= 23 && dia <= diaMax) {
                    System.out.println("Libra");
                }
            } else if (mes == 10) {
                if (dia >= 1 && dia <= 22) {
                    System.out.println("Libra");
                } else if (dia >= 23 && dia <= diaMax) {
                    System.out.println("Escorpiao");
                }
            } else if (mes == 11) {
                if (dia >= 1 && dia <= 21) {
                    System.out.println("Escorpiao");
                } else if (dia >= 22 && dia <= diaMax) {
                    System.out.println("Sargitario");
                }
            } else if (mes == 12) {
                if (dia >= 1 && dia <= 21) {
                    System.out.println("Sargitario");
                } else if (dia >= 22 && dia <= diaMax) {
                    System.out.println("Capricornio");
                }
            }

         }

         s.close();

    }
}
