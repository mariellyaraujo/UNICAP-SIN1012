package Lista4;
import java.util.ArrayList;
class Produto {
    String nome;
    double preco;
    int quantidade;
}
public class Q2 {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>(); 

        Produto p1 = new Produto();
        p1.nome = "morango";
        p1.preco = 10.50;
        p1.quantidade = 35;

        Produto p2 = new Produto();
        p2.nome = "pão de mel";
        p2.preco = 7.80;
        p2.quantidade = 60;

        Produto p3 = new Produto();
        p3.nome = "tititi de cebola";
        p3.preco = 1.50;
        p3.quantidade = 300;

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        for(int i = 0; i < produtos.size(); i++){
            Produto p = produtos.get(i);

            System.out.println("nome: " + p.nome + " | valor total em estoque: R$" + p.preco * p.quantidade);
        }
    }
}
