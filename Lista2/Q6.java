package Lista2;

public class Q6 {

    public static boolean Vencer(char[][] tab, char jogador){
        int digPrincipal = 0, linha = 0, coluna = 0, digSecundaria = 0;
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; i < tab.length; i++){
                if (i == j) {
                    if(tab[i][j] == jogador){
                        digPrincipal++;
                    }
                } 
            }
        }

        if(digPrincipal==3) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args){

    }
    
}
