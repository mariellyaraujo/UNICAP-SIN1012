package Lista2;

public class Q5 {
    public static int[] frequencia(int[] opinioes){
        int[] frequencia = new int[5];

        for(int i = 0; i < opinioes.length; i++){
            switch(opinioes[i]){
                case 1:
                    frequencia[0]++;
                    break;
                case 2:
                    frequencia[1]++;
                    break;
                case 3:
                    frequencia[2]++;
                    break;
                case 4:
                    frequencia[3]++;
                    break;
                case 5:
                    frequencia[4]++;
                    break;
            }
        }

        return frequencia;
    }

    public static double satisfacaoMedia(int[] opinioes){
        double soma = 0;

        int[] frequencia = frequencia(opinioes);

        for(int i = 0; i < frequencia.length; i++){
            soma += frequencia[0] * (i+1);
        }
        return soma / opinioes.length;
    }

    public static void main(String[] args){
        int[] opinioes = {4,5,3,2,4,1,5,3,2,4,5,5,5,3,1,2,4,5,3,2,3,3,4,5,1,2,4,3,4,5};

        int[] frequencia = frequencia(opinioes);

        System.out.print("frequência: ");
        for(int i = 0; i < frequencia.length; i++){
            System.out.print(frequencia[i] + " ");
        }
        
        System.out.println("\nmédia: " + satisfacaoMedia(opinioes));

    }
}
