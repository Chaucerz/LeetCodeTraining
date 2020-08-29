package leetcode_90_subsetsWithDup;

import java.util.*;

/**
 * @author Chaucer
 * @date 2019-09-04 15:05
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, 0, res, new ArrayList<Integer>());
        return res;
    }

    private void backTrack(int[] nums, int i, List<List<Integer>> res, ArrayList<Integer> list) {
        if (!res.contains(list)) {
            res.add(new ArrayList<>(list));
        }
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            backTrack(nums, j + 1, res, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        new Solution().subsetsWithDup(nums);
    }
}
