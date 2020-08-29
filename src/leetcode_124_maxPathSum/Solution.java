package leetcode_124_maxPathSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Chaucer
 * @date 2019-09-01 19:21
 */
public class Solution {
    private int res;
    public int maxPathSum(TreeNode root) {

        res = Integer.MIN_VALUE;
        recur(root);
        return res;
    }

    private int recur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = recur(root.left);
        int r = recur(root.right);
        res = Math.max(res, (l + r) + root.val);
        res = Math.max(res, Math.max(l, r) + root.val);
        res = Math.max(res, root.val);

        int max = Math.max(l, r);
        return max > 0 ? max + root.val : root.val;
    }

    public static void main(String[] args) {
        String str = "-10,9,20,null,null,15,7";
        String[] strArr = str.split("\\,");
        TreeNode[] nodes = new TreeNode[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("null"))
                nodes[i] = new TreeNode(Integer.valueOf(strArr[i]));
        }

        for (int i = 0, j = 1; j < strArr.length; i++) {
            if (nodes[i] != null) {
                nodes[i].left = nodes[j++];
                nodes[i].right = nodes[j++];
            }
        }
        int i = new Solution().maxPathSum(nodes[0]);
        System.out.println(i);
    }

}
