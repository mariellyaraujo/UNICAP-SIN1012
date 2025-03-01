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

        System.out.println("Numero de consoantes: " + counter);

        for(int i = 0; i < counter; i++) {
            System.out.print(consoantes[i] + " ");
        }
    }
}