package leetcode_40_combinationSum2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chaucer
 * @date 2019-09-04 16:15
 */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();
        backTrack(candidates, 0, res, new ArrayList<>(), target);
        return res;
    }

    private void backTrack(int[] candidates, int i, List<List<Integer>> res, ArrayList<Integer> list, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(list));
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]){
                continue;
            }
            list.add(candidates[j]);
            backTrack(candidates, j + 1, res, list, target - candidates[j]);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;
        new Solution().combinationSum2(nums, 8);
    }
}
