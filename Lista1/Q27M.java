package Lista1;
import java.util.Scanner;

public class Q27M {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        String[][] alunos = new String[n][31];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 31; j++) {
                alunos[i][j] = "";
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 31; j++) {
                int cFaltas = 0;
                int countK = 0;
                int[] diasReprov = new int[30];

                alunos[i][j] = s.nextLine();

                for (int k = 1; k < 31; k++) {
                    if (alunos[i][k] != null && alunos[i][k].equals("F")) {
                        cFaltas += 1;
                        diasReprov[countK] = k;
                        countK++;
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
        }
    }
}
