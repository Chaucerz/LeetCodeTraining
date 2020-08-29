package duxiaoman;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-15 19:29
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        help(nums,x,y);
    }

    private static void help(int[][] nums, int x, int y) {
        int count = 0;
        int curr_x = 0;
        int curr_y = 0;

        while (curr_x != x && curr_y != y) {
            if (curr_x < x) {
                curr_x++;
            }
            if (isBarrier(nums,curr_x,curr_y)){
                curr_x--;
            }
        }
    }

    public static boolean isBarrier(int[][] nums, int curr_x, int curr_y) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i][0] == curr_x && nums[i][1] == curr_y) {
                return true;
            }
        }
        return false;
    }
}
