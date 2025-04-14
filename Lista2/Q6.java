package Lista2;

public class Q6 {

    public static boolean Vencer(char[][] tab, char jogador){
        int digPrincipal = 0, digSecundaria = 0;
        for(int i = 0; i < tab.length; i++){
            int linha = 0, coluna = 0;

            for(int j = 0; j < tab.length; j++){

                if(tab[i][j] == jogador) linha++;
                if(tab[j][i] == jogador) coluna++;

                if(i == j && tab[i][j] == jogador) digPrincipal++;
                if(i + j == tab.length - 1 && tab[i][j] == jogador) digSecundaria++;
                
            }

            if(linha == 3) return true;
            if(coluna == 3) return true;
        }

        if(digPrincipal == 3) {
            return true;
        } else if (digSecundaria == 3){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args){
        char[][] tab = {{'0', 'X', '0'},
                       {'0', 'X', 'X'},
                        {'0', 'X', '0'}};

        char jogador = 'X';

        System.out.print(Vencer(tab, jogador));
        
    }
    
}
