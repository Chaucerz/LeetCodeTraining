package qianxin;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-09 20:00
 */
public class Main1 {

    static TreeNode  res = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String node = sc.nextLine();
        String find = sc.nextLine();
        
        int N = Integer.valueOf(n);
        String[] finds = find.split(" ");

        TreeNode root = deserialize(node);
        TreeNode p = new TreeNode(Integer.valueOf(finds[0]));
        TreeNode q = new TreeNode(Integer.valueOf(finds[1]));

        help(root, p, q);
        System.out.println(res.val);
    }

    public static void help(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val - p.val) * (root.val - q.val) <= 0) {
            res = root;
        } else if (root.val < p.val && root.val < q.val) {
            help(root.right, p, q);
        } else {
            help(root.left, p, q);
        }

    }

    public static TreeNode deserialize(String data) {

        if (data == null || data.length() == 0){
            return null;
        }
        String[] str = data.split(" ");
        TreeNode[] nodes = new TreeNode[str.length];

        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("-1")){
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}