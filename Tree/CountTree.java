package Tree;

import Tree.Inorder.TreeNode;

public class CountTree {

    static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ln = countNodes(root.left);
        int rn = countNodes(root.right);
        return ln+rn+1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(countNodes(root));

    }
}
