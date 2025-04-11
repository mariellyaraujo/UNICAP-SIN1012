package questoesDeSala.A03_11;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        int somatorio = 0;
        int[] diasChuva = new int[7];
        String[] diasSemana = {"Seg: ", "Ter: ", "Qua: ", "Qui: ", "Sex: ", "Sab: ","Dom: "};
        int aux = 0;



        Scanner s = new Scanner(System.in);

        System.out.println("Escreva a quantidade de chuva de cada dia da semana (7):");
        for(int i = 0; i < diasChuva.length; i++){
            diasChuva[i] = s.nextInt();
        }

        for(int i = 0; i < diasSemana.length; i++){
            System.out.println(diasSemana[i] + diasChuva[i]);
        }

        for(int i = 0; i < diasChuva.length; i++){
            for(int j = 0; j<4; j++){
                if(diasChuva[j] > diasChuva[j + 1]){
                    aux = diasChuva[j];
                    diasChuva[j] = diasChuva[j+1];
                    diasChuva[j+1] = aux;
                }
            }
        }

        for(int i = 0; i < diasChuva.length; i++){
            somatorio = somatorio + diasChuva[i];
        }

        
        System.out.println("Maior: " + diasChuva[diasChuva.length - 1]);
        System.out.println("Menor: " + diasChuva[0]);
        System.out.println("Somatorio: " + somatorio);
        System.out.println("Media: " + somatorio / diasChuva.length);

        s.close();
    }
}