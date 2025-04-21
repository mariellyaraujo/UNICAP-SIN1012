package Provas.prova1;

public class Q3 {
    public static void print(int[] x){
        for(int i = 0; i < x.length; i++) System.out.print(x[i] + " ");
    }
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25};

        for(int i = 0; i < nums.length / 2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println("a - A estrutura de repetição troca a ordem do vetor, o deixando de trás para frente");
        System.out.println("b - ");
    }
}
