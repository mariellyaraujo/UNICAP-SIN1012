package Lista4;
class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
}
public class Q3 {
    public static void main(String[] args) {
        Livro[] livros = new Livro[10];

        for(int i = 0; i < livros.length; i++){
            livros[i] = new Livro();
        }
    }
}
