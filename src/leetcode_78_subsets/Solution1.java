package leetcode_78_subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaucer
 * @date 2019-09-04 13:34
 * 使用位运算实现
 */
public class Solution1 {
    public List<List<Integer>> subsets(int[] nums) {

        int n = nums.length;
        int allSets = (int) Math.pow(2, n);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < allSets; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = n - 1, k = 0; j >= 0; j--,k++) {
                int curr = (int) Math.pow(2, j);
                if ((curr & i) != 0) {
                    list.add(nums[k]);
                }
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        new Solution1().subsets(nums);
    }
}
