package Tree;

import Tree.Inorder.TreeNode;
import java.util.*;

public class Postorder {
    static class Node{
        int data;
        TreeNode left;
        TreeNode right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static  List<Integer> postorder(TreeNode root) {
        // your code goes here
        List<Integer> result = new ArrayList<>();
        postorderHelper(root , result);
        return result;
    }
    public static void postorderHelper(TreeNode root , List<Integer> result){
        if(root == null){
            return;
        }
        postorderHelper(root.left, result);
        postorderHelper(root.right, result);
        result.add(root.data);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(postorder(root));
        
    }
}
