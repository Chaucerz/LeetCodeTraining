package leetcode_105_preOrderAndInOrder;

/**
 * @author Chaucer
 * @date 2019-09-27 19:20
 */
public class Solution {

    public TreeNode buildTree(int[] preOrder, int[] inorder) {
        return buildTreeHelper(preOrder,0, preOrder.length,inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preOrder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {

        if (p_start == p_end) {
            return null;
        }
        int rootVal = preOrder[p_start];
        TreeNode root = new TreeNode(rootVal);
        int i_root_index = 0;
        for (int i = i_start; i < i_end; i++) {
            if (inorder[i] == rootVal){
                i_root_index = i;
                break;
            }
        }
        int leftNum = i_root_index - i_start;

        root.left = buildTreeHelper(preOrder,p_start + 1, p_start + leftNum + 1, inorder, i_start, i_start + leftNum);
        root.right = buildTreeHelper(preOrder, p_start + leftNum + 1, p_end, inorder,i_root_index + 1,i_end);
        return root;
    }
}
