package Lista4;

class Aluno{
    String nome;
    int idade;
    double nota;
}
public class Q1 {
    public static void main(String[] args){
        Aluno[] alunos = new Aluno[5];

        for(int i = 0; i < alunos.length; i++){
            alunos[i] = new Aluno();
        }

        alunos[0].nome = "Ana Maria Braga";
        alunos[0].idade = 100000;
        alunos[0].nota = 8.76;

        alunos[1].nome = "melly";
        alunos[1].idade = 18;
        alunos[1].nota = 10;

        alunos[2].nome = "karl marx da silva";
        alunos[2].idade = 23;
        alunos[2].nota = 8.96;

        alunos[3].nome = "fulano";
        alunos[3].idade = 78;
        alunos[3].nota = 0.76;

        alunos[4].nome = "artur morgan";
        alunos[4].idade = 45;
        alunos[4].nota = 5.67;

        for(int i = 0; i < alunos.length; i++){
            System.out.println("nome: " + alunos[i].nome + "; nota: " + alunos[i].nota);
        }
    }
}
