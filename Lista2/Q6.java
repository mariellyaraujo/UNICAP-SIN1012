package Lista2;

public class Q6 {

    public static void Vencer(char[][] tab, char jogador){
        int digPrincipal = 0, linha = 0, coluna = 0, digSecundaria = 0;
        for(int i = 0; i < tab.length; i++){
            linha = 0;
            coluna = 0;
            for(int j = 0; i < tab.length; i++){
                if (i == j) {
                    if(tab[i][j] == jogador){
                        digPrincipal++;
                    }
                } else if (i == tab.length - j - 1){
                    if(tab[i][j] == jogador){
                        digSecundaria++;
                    }
                } else if (tab[i][j] == jogador){
                    linha++;
                } else if (tab[j][i] == jogador){
                    coluna++;
                }
            }
        }

        if(digPrincipal==3) {
            System.out.println("true (jogador " + jogador + " venceu na diagonal principal");
        } else if (digSecundaria == 3){
            System.out.println("true (jogador " + jogador + " venceu na diagonal secundaria");
        } else if (linha == 3){
            System.out.println("true (jogador " + jogador + " venceu na linha");
        } else if (coluna == 3){
            System.out.println("true (jogador " + jogador + " venceu na coluna");
        } else {
            System.out.println("false (velha)");
        }

    }
    public static void main(String[] args){
        char[][] tab = {{'0', 'X', '0'},
                       {'0', 'X', 'X'},
                        {'0', 'X', '0'}};

        char jogador = 'X';

        Vencer(tab, jogador);
    }
    
}
