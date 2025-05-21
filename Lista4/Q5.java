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
            s.nextLine();
            carros[i].cor = s.nextLine();
        }
        return carros;
    }
    public static void printIf (Carro[] v){
        for(int i = 0; i < v.length; i++){
            if (v[i].ano > 2020){
                System.out.println(v[i].modelo + ", " + v[i].cor);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Carro[] carros = new Carro[5];
        int n = carros.length;
        carros = preencheVetor(n, s);
    
        printIf(carros);
    }
    
}
