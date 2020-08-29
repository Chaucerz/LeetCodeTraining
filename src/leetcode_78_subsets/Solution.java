package leetcode_78_subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaucer
 * @date 2019-09-03 20:34
 * 使用回溯法实现
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();

        backTrack(nums, 0, res, new ArrayList<Integer>());
        return res;
    }

    private void backTrack(int[] nums, int i, List<List<Integer>> res, ArrayList<Integer> list) {
        res.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            backTrack(nums, j + 1, res, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        new Solution().subsets(nums);
    }
}
