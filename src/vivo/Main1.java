package vivo;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-22 16:05
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");

        int[] nums = new int[strs.length];
        for (int i = 0 ; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        int res = help(nums);
        System.out.println(res);
    }

    private static int help(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int count = 0;
        int[] index = new int[nums.length];
        for (int i = 0 ; i < nums.length; i++) {
            index[i] = nums[i] + i;
        }

        int j = 0;
        int max = index[0];
        while (j < index.length && j <= max) {
            if (index[j] >= index.length) {
                return count + 1;
            }
            j = max;
            max = index[j];
            count++;

            if (j == index[j]){
                break;
            }
        }
        return -1;
    }
}
