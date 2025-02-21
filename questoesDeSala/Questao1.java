package questoesDeSala;
import java.util.Scanner;

public class Questao1 {

public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    /* Crie um scanner (imput) 
    */

    for(int i = 0; i < 10; i++){

    int a = s.nextInt();
    
    if(a < 0){
        System.out.println("negativo");

    } else {

        System.out.println("positivo");
    } 
    }

    s.close();
   
}
}
