package questoesDeSala.A28_03;

import java.util.Scanner;

public class Q1 {
    public static void verifSort(int[] v){
        int result = 0, numAtual = 0, verif = 0;
        
        // 0 - crescente
        // 1 - decrescente
        // 2 - nao ordenado
        if (v[0] <= v[1]){
            verif = 0;
        } else if(v[0] >= v[1]){
            verif = 1;
        }
        for(int i = 0; i < v.length - 1; i++){
            numAtual = v[i];

            if(numAtual <= v[i+1] && verif == 0){
                result = 0;
            } else if (numAtual >= v[i+1] && verif == 1){
                result = 1;
            } else {
                result = 2;
                break;
            }
        }

        switch (result) {
            case 0:
                System.out.println("É crescente");
                break;
        
            case 1:
                System.out.println("É decrescente");
                break;

            case 2:
            System.out.println("É não ordenado");
            break;
        }
    }
    public static void verifQuant(int[] v, int x){
        int maior = 0, menor = 0, igual = 0;

        for(int i = 0; i < v.length; i++){
            if(v[i] > x){
                maior += 1;
            } else if(v[i] == x) {
                igual += 1;
            } else {
                menor += 1;
            }
        }

        System.out.println("Números maiores que X: " + maior);
        System.out.println("Números menores que X: " + menor);
        System.out.println("Números iguais a X: " + igual);
    }

    public static void lerVetor(int[] v, Scanner s){
        for(int i = 0; i < v.length; i++){
            v[i] = s.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[10];

        lerVetor(vetor, s);

        int x = s.nextInt();

        verifQuant(vetor, x);
        verifSort(vetor);
        
    }
}
