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

        filmes[0].titulo = "suspiria (1977)";
        filmes[0].genero = "Suspense";
        filmes[0].duracaoMinutos = 99;

        filmes[1].titulo = "missao impossivel 999";
        filmes[1].genero = "Ação";
        filmes[1].duracaoMinutos = 170;

        filmes[2].titulo = "Sherek 3";
        filmes[2].genero = "Culto";
        filmes[2].duracaoMinutos = 93;

        filmes[3].titulo = "grande hotel budapeste";
        filmes[3].genero = "Comédia";
        filmes[3].duracaoMinutos = 100;

        filmes[4].titulo = "O Que é Isso, Companheiro?";
        filmes[4].genero = "Drama";
        filmes[4].duracaoMinutos = 110;
    }
}
