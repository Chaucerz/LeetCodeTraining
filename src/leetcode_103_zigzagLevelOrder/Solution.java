package leetcode_103_zigzagLevelOrder;

import java.util.*;

/**
 * @author Chaucer
 * @date 2019-09-09 10:00
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int n = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode curr = queue.poll();
                if (!flag) {
                    list.add(curr.val);
                } else {
                    list.addFirst(curr.val);
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            flag = true;
            res.add(list);
        }

        return res;
    }
}
