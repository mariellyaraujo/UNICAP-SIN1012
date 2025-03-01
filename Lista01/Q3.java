package Lista01;

import java.util.Scanner;

    public class Q3 {
        public static void main(String[] args){

            Scanner s = new Scanner(System.in);

            int a = s.nextInt();
            int b = s.nextInt();

            s.close();

            if (b > a){
                for(int i = a+1; i < b; i++){
                    if(i != b-1){
                    System.out.print(i + ", ");
                    } else {
                        System.out.print(i + ".");
                    }
                }
            }
        }
    }