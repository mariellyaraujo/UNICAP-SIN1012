package Lista3;
import java.util.Scanner;
public class Q2 {
    public static String[] preencheVetor(int n, Scanner s){
        String[] v = new String[n];
        for(int i = 0; i < n; i++) v[i] = s.nextLine();
        return v;
    }

    public static void buscaLivros (String[] v, String busca){
        boolean naoEncontrado = true;
        for(int i = 0; i < v.length; i++){
            if(v[i].toLowerCase().contains(busca.toLowerCase())){
                System.out.println(v[i]);
                naoEncontrado = false;
            }
        }
        if (naoEncontrado == true) System.out.println("nao encontrado");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine(); 

        String[] v = preencheVetor(n, s);

        String busca = s.nextLine();

        buscaLivros(v, busca);
    }
}
