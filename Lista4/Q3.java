package Lista4;
class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
}
public class Q3 {
    public static void printIf(Livro[] v){
        for(int i = 0; i < v.length; i++){
            if(v[i].anoPublicacao > 2010){
                System.out.println(v[i].titulo + ", " + v[i].autor);
            }
        }
    }
    public static void main(String[] args) {
        Livro[] livros = new Livro[10];

        for(int i = 0; i < livros.length; i++){
            livros[i] = new Livro();
        }

        livros[0].titulo = "Crime e Castigo";
        livros[0].autor = "Fiódor Dostoiévski";
        livros[0].anoPublicacao = 1866;

        livros[1].titulo = "Diário de um Banana 19";
        livros[1].autor = "Jeff Kinney";
        livros[1].anoPublicacao = 2024;

        livros[2].titulo = "O Pequeno Príncipe";
        livros[2].autor = "Antoine de Saint-Exupéry";
        livros[2].anoPublicacao = 1943;

        livros[3].titulo = "Os miseráveis";
        livros[3].autor = "Walcyr Carrasco";
        livros[3].anoPublicacao = 2012;

        livros[4].titulo = "Noites brancas";
        livros[4].autor = "Fiódor Dostoiévski";
        livros[4].anoPublicacao = 1848;

        livros[5].titulo = "O Idiota";
        livros[5].autor = "Fiódor Dostoiévski";
        livros[5].anoPublicacao = 1869;

        livros[6].titulo = "Notas do Subterrâneo";
        livros[6].autor = "Fiódor Dostoiévski";
        livros[6].anoPublicacao = 1864;

        livros[7].titulo = "mas que crueldade ein...";
        livros[7].autor = "eu";
        livros[7].anoPublicacao = 1990;

        livros[8].titulo = "Minecraft Guia da redstone";
        livros[8].autor = "Mojang";
        livros[8].anoPublicacao = 2023;

        livros[9].titulo = "Redoma de Vidro";
        livros[9].autor = "Sylvia Plath";
        livros[9].anoPublicacao = 1963;
    }
}
