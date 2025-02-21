package Lista0;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] nums = new int[3];

        nums[0] = s.nextInt();
        nums[1] = s.nextInt();
        nums[2] = s.nextInt();

        s.close();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        
        System.out.println(nums[0] + " >= " + nums[1] + " >= " + nums[2]);

        s.close();
        
    }
}
