package Lista4;

class Filme {
    String titulo;
    String genero;
    int duracaoMinutos;
}
public class Q4 {
    public static void main(String[] args) {
        Filme[] filmes = new Filme[5];

        for(int i = 0; i < filmes.length; i++){
            filmes[i] = new Filme();
        }
    }
}
