package Lista1;
import java.util.Scanner;
public class Q6V {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int calc = 0;
        int[] idade = new int[20];
        String[] nome = new String[20];

        for(int i = 0; i < idade.length; i++){
            nome[i] = s.nextLine();
            idade[i] = s.nextInt();
            s.nextLine();

            calc += idade[i];
        }

        int media = (int) Math.round((double) calc / idade.length);

        System.out.println("Média das idades: " + media);
        System.out.println("Pessoas com a idade superior à média:");
        for(int i = 0; i < nome.length; i++){
            if(idade[i] > media) {
                System.out.println(nome[i]);
            }
        }

        s.close();
    }
}
