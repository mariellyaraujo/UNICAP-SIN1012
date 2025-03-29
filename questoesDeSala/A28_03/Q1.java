package questoesDeSala.A28_03;

public class Q1 {
    public static void verifSort(int[] v){
        int result = 0, numAtual = 0, verif = 0;
        
        // 0 - crescente
        // 1 - decrescente
        // 2 - nao ordenado
        if (v[0] <= v[1]){
            verif = 0;
        } else if(v[0] >= v[1]){
            verif = 1;
        }
        for(int i = 0; i < v.length - 1; i++){
            numAtual = v[i];

            if(numAtual <= v[i+1] && verif == 0){
                result = 0;
            } else if (numAtual >= v[i+1] && verif == 1){
                result = 1;
            } else {
                result = 2;
                break;
            }
        }

        switch (result) {
            case 0:
                System.out.println("É crescente");
                break;
        
            case 1:
                System.out.println("É decrescente");
                break;

            case 2:
            System.out.println("É não ordenado");
            break;
        }
    }
    public static void main(String[] args) {
        
    }
}
