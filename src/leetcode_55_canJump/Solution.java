package leetcode_55_canJump;

/**
 * @author Chaucer
 * @date 2019-08-31 13:09
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int[] index = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = nums[i] + i;
        }

        int j = 0;
        int max = index[0];
        while (j < index.length && j <= max) {
            if (max < index[j]) {
                max = index[j];
            }
            j++;
        }
        if (j == nums.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,0,4};
        boolean b = new Solution().canJump(nums);
        System.out.println(b);
    }
}
