package Lista01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        int counter = 0;
        char[] consoantes = new char[6];
        char[] vetor = new char[6];

        Scanner s = new Scanner(System.in);

        System.out.println("Digite 6 caracteres separados por um espaco:");
        for(int i = 0; i < 6; i++){
            vetor[i] = s.next().charAt(0);

            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u') {
                consoantes[counter] = vetor[i];

                counter++;
            }
        }

        s.close();

        System.out.println("Numero de consoantes: " + counter);

        if (counter == 0){
            System.out.println("Nenhuma consoante digitada.");
            return;
        }

        for(int i = 0; i < counter; i++) {
            if(i != counter-1) {
            System.out.print(consoantes[i] + ", ");
            } else {
                System.out.print(consoantes[i]);
            }
        }
    }
}