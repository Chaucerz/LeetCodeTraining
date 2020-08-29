package leetcode_297_serializeAndDeserialize;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Chaucer
 * @date 2019-09-01 19:56
 */
public class Solution {
    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode curr = queue.poll();
                if (curr != null) {
                    queue.add(curr.left);
                    queue.add(curr.right);
                    sb.append(curr.val + ",");
                } else {
                    sb.append("#" + ",");
                }
            }
            if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {

        if (data == null || data.length() == 0){
            return null;
        }
        String[] str = data.split(",");
        TreeNode[] nodes = new TreeNode[str.length];

        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("#")){
                nodes[i] = new TreeNode(Integer.valueOf(str[i]));
            }
        }

        for (int i = 0, j = 1; j < nodes.length; i++) {
            if (nodes[i] != null){
                nodes[i].left = nodes[j++];
                nodes[i].right = nodes[j++];
            }
        }

        return nodes[0];
    }
}
