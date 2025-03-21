package Lista1;
import java.util.Scanner;
public class Q6V {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int calc = 0;
        int[] idade = new int[5];
        String[] nome = new String[5];

        for(int i = 0; i < idade.length; i++){
            nome[i] = s.nextLine();
            idade[i] = s.nextInt();
            s.nextLine();
        }

        calc = calc / idade.length;

        System.out.println(calc);

        for(int i = 0; i < nome.length; i++){
            if(i < nome.length) {
                if(idade[i] > calc) {
                    System.out.print(nome[i] + ", ");
                }
            } else if(i == nome.length) {
                System.out.print(nome[i] + ".");
            }
        }

        s.close();
    }
}
