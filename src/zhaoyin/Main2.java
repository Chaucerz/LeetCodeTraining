package zhaoyin;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-15 21:21
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n - 1][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        int[] res = help(nums, n);
        for (int i = 0; i < res.length; i++) {
           System.out.println(res[i] + " ");
        }
    }

    private static int[] help(int[][] nums, int n) {

        int root = 1;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int[] res = new int[n];
        boolean flag = false;
        while (root <= n) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i][0] == root) {
                    count += nums[i][2];
                    int j = i + 1;
                    for (; j < nums.length;j++) {
                        if (nums[j][0] == nums[i][1]) {
                            if (nums[j][2] > max) {
                                max = nums[j][2];
                                root = nums[j][1];
                            }
                            flag = true;
                        }
                    }
                    if (!flag) {
                       res[n - 1] = 0;
                    }
                    count += max;
                }
            }
        }
        res[root - 1] = count;
        return res;
    }
}
