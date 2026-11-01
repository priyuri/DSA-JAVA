package Tree;

public class MaxDepth {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static  int maxDepth(TreeNode root) {
        // your code goes here
        if(root == null){
            return 0;
        }
        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);
        return Math.max(ld , rd) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(6);
        System.out.println(maxDepth(root));
        
    }
    
}
