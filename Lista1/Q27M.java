////////////QUESTÃO 14 - MATRIZES
package Lista1;
import java.util.Scanner;

public class Q27M {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        String[][] alunos = new String[n][31];

        for (int i = 0; i < n; i++) {
            System.out.println("digite o nome do aluno:");
            alunos[i][0] = s.nextLine();
            System.out.println("faltas e presencas:");

            for (int j = 1; j <= 30; j++) {
                alunos[i][j] = s.next();
            }
            s.nextLine();
        }

        for (int i = 0; i < n; i++) {
            int cFaltas = 0;
            int countK = 0;
            int[] diasReprov = new int[30];

            for (int k = 1; k <= 30; k++) {
                if (alunos[i][k].equals("F")) {
                    diasReprov[countK] = k;
                    countK++;
                    cFaltas++;
                }
            }

            if (cFaltas > 10) {
                System.out.print(alunos[i][0] + " - dias: ");
                for (int k = 0; k < cFaltas; k++) {
                    System.out.print(diasReprov[k] + " ");
                }
                System.out.println();
            }
        }

        s.close();
    }
}
