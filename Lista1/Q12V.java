package Lista1;
import java.util.Scanner;
public class Q12V {

    public static void printVet(int[] v){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vet = new int[10];

        for(int i = 0; i < vet.length; i++){
            vet[i] = s.nextInt();

            for(int j = 0; j < i; j++){
                if(vet[i] == vet[j]){
                    System.out.println("tente novamente");
                    i--;
                    break;
                }
            }
        }

        printVet(vet);

        s.close();
    }
}
