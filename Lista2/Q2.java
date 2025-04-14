package Lista2;

public class Q2 {
    public static int[] contarVotos(int[] contagem){
        int[] resultadoVotos = new int[5];

        for(int i = 0; i < contagem.length; i++){
            if(contagem[i] == 0) resultadoVotos[0]++;
            if(contagem[i] == 1) resultadoVotos[1]++;
            if(contagem[i] == 2) resultadoVotos[2]++;
            if(contagem[i] == 3) resultadoVotos[3]++;
            if(contagem[i] == 4) resultadoVotos[4]++;
        }
        return resultadoVotos;
    }

    public static int vencedor(int[] contagem){
  
        int votosVencedor = 0;
        int indiceVencedor = 0;

        for(int i = 0; i < contagem.length; i++){
            if(contagem[i] > votosVencedor){
                votosVencedor = contagem[i];
                indiceVencedor = i;
            }
        }
        return indiceVencedor;
    }

    public static void main(String[] args) {
        int[] votos = {0, 1,4,3,3,2,1,4,4,2,0,1,1,3,2,2,4,4,1,0};
        int[] contagem = contarVotos(votos);


        for(int i = 0; i < contagem.length; i++){
            System.out.print(contagem[i] + " ");
        }

        System.out.println(vencedor(contagem));
    }
}
