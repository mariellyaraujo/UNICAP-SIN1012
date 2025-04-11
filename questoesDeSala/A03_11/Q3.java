package questoesDeSala.A03_11;

public class Q3 {
    public static void main(String[] args){
        int[] A = {2, 4, 6, 8, 10};
        int[] B = {1, 3, 5, 7, 9};

        int[] C = new int[A.length];

        for(int i = 0; i < A.length; i++){
            C[i] = A[i] + B[i];
        }

        for(int i = 0; i < A.length; i++){
            System.out.println(C[i]);
        }

    }
}