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
}
