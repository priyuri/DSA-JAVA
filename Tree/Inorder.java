package Tree;
import java.util.*;
public class Inorder {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static List<Integer> inorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorderHelper(root , result);
        return result;
    }
    public static void inorderHelper(TreeNode root , List<Integer>result){
        if(root == null){
            return ;
        }
        inorderHelper(root.left, result);
        result.add(root.data);
        inorderHelper(root.right, result);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(inorder(root));
    }
}
