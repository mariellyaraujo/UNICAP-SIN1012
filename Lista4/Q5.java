package Lista4;
import java.util.Scanner;
class Carro {
    String modelo;
    int ano;
    String cor;
}

public class Q5 {
    public static Carro[] preencheVetor (int n, Scanner s){
        Carro[] carros = new Carro[n];
        for(int i = 0; i < carros.length; i++){
            carros[i] = new Carro();
            carros[i].modelo = s.nextLine();
            carros[i].ano = s.nextInt();
            carros[i].cor = s.next();
        }
        return carros;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Carro[] carros = new Carro[5];
        int n = carros.length;
        carros = preencheVetor(n, s);
    
    }
    
}
